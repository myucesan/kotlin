/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.fir.analysis.checkers.declaration

import org.jetbrains.kotlin.diagnostics.DiagnosticReporter
import org.jetbrains.kotlin.diagnostics.reportOn
import org.jetbrains.kotlin.fir.analysis.checkers.MppCheckerKind
import org.jetbrains.kotlin.fir.analysis.checkers.context.CheckerContext
import org.jetbrains.kotlin.fir.analysis.diagnostics.FirErrors
import org.jetbrains.kotlin.fir.declarations.*
import org.jetbrains.kotlin.fir.declarations.utils.isInline

object FirReifiedTypeParameterChecker : FirTypeParameterChecker(MppCheckerKind.Common) {
    context(context: CheckerContext, reporter: DiagnosticReporter)
    override fun check(declaration: FirTypeParameter) {
        if (!declaration.isReified) return
        val containingDeclaration = context.containingDeclarations.lastOrNull() ?: return

        val forbidReified = (containingDeclaration is FirRegularClass) ||
                (containingDeclaration is FirSimpleFunction && !containingDeclaration.isInline) ||
                (containingDeclaration is FirProperty && !containingDeclaration.areAccessorsInline())

        if (forbidReified) {
            reporter.reportOn(declaration.source, FirErrors.REIFIED_TYPE_PARAMETER_NO_INLINE)
        }

        if (containingDeclaration is FirTypeAlias) {
            reporter.reportOn(declaration.source, FirErrors.REIFIED_TYPE_PARAMETER_ON_ALIAS)
        }
    }

    private fun FirProperty.areAccessorsInline(): Boolean {
        if (getter?.isInline != true) return false
        if (isVar && setter?.isInline != true) return false
        return true
    }

}
