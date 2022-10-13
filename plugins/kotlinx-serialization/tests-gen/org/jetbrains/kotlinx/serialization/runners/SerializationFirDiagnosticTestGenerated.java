/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlinx.serialization.runners;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlinx.serialization.TestGeneratorKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
public class SerializationFirDiagnosticTestGenerated extends AbstractSerializationFirDiagnosticTest {
    @Nested
    @TestMetadata("plugins/kotlinx-serialization/testData/diagnostics")
    @TestDataPath("$PROJECT_ROOT")
    public class Diagnostics {
        @Test
        public void testAllFilesPresentInDiagnostics() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/kotlinx-serialization/testData/diagnostics"), Pattern.compile("^(.+)\\.kt$"), Pattern.compile("^(.+)\\.fir\\.kts?$"), true);
        }

        @Test
        @TestMetadata("DuplicateSerialName.kt")
        public void testDuplicateSerialName() throws Exception {
            runTest("plugins/kotlinx-serialization/testData/diagnostics/DuplicateSerialName.kt");
        }

        @Test
        @TestMetadata("EnumDuplicateSerialName.kt")
        public void testEnumDuplicateSerialName() throws Exception {
            runTest("plugins/kotlinx-serialization/testData/diagnostics/EnumDuplicateSerialName.kt");
        }

        @Test
        @TestMetadata("ExternalSerializers.kt")
        public void testExternalSerializers() throws Exception {
            runTest("plugins/kotlinx-serialization/testData/diagnostics/ExternalSerializers.kt");
        }

        @Test
        @TestMetadata("GenericArrays.kt")
        public void testGenericArrays() throws Exception {
            runTest("plugins/kotlinx-serialization/testData/diagnostics/GenericArrays.kt");
        }

        @Test
        @TestMetadata("IncorrectTransient.kt")
        public void testIncorrectTransient() throws Exception {
            runTest("plugins/kotlinx-serialization/testData/diagnostics/IncorrectTransient.kt");
        }

        @Test
        @TestMetadata("IncorrectTransient2.kt")
        public void testIncorrectTransient2() throws Exception {
            runTest("plugins/kotlinx-serialization/testData/diagnostics/IncorrectTransient2.kt");
        }

        @Test
        @TestMetadata("InheritableInfo.kt")
        public void testInheritableInfo() throws Exception {
            runTest("plugins/kotlinx-serialization/testData/diagnostics/InheritableInfo.kt");
        }

        @Test
        @TestMetadata("LazyRecursionBug.kt")
        public void testLazyRecursionBug() throws Exception {
            runTest("plugins/kotlinx-serialization/testData/diagnostics/LazyRecursionBug.kt");
        }

        @Test
        @TestMetadata("LocalAndAnonymous.kt")
        public void testLocalAndAnonymous() throws Exception {
            runTest("plugins/kotlinx-serialization/testData/diagnostics/LocalAndAnonymous.kt");
        }

        @Test
        @TestMetadata("NoSuitableCtorInParent.kt")
        public void testNoSuitableCtorInParent() throws Exception {
            runTest("plugins/kotlinx-serialization/testData/diagnostics/NoSuitableCtorInParent.kt");
        }

        @Test
        @TestMetadata("NonSerializable.kt")
        public void testNonSerializable() throws Exception {
            runTest("plugins/kotlinx-serialization/testData/diagnostics/NonSerializable.kt");
        }

        @Test
        @TestMetadata("NullabilityIncompatible.kt")
        public void testNullabilityIncompatible() throws Exception {
            runTest("plugins/kotlinx-serialization/testData/diagnostics/NullabilityIncompatible.kt");
        }

        @Test
        @TestMetadata("ParamIsNotProperty.kt")
        public void testParamIsNotProperty() throws Exception {
            runTest("plugins/kotlinx-serialization/testData/diagnostics/ParamIsNotProperty.kt");
        }

        @Test
        @TestMetadata("SerializableEnums.kt")
        public void testSerializableEnums() throws Exception {
            runTest("plugins/kotlinx-serialization/testData/diagnostics/SerializableEnums.kt");
        }

        @Test
        @TestMetadata("SerializableIgnored.kt")
        public void testSerializableIgnored() throws Exception {
            runTest("plugins/kotlinx-serialization/testData/diagnostics/SerializableIgnored.kt");
        }

        @Test
        @TestMetadata("SerializerTypeCompatibleForSpecials.kt")
        public void testSerializerTypeCompatibleForSpecials() throws Exception {
            runTest("plugins/kotlinx-serialization/testData/diagnostics/SerializerTypeCompatibleForSpecials.kt");
        }

        @Test
        @TestMetadata("SerializerTypeIncompatible.kt")
        public void testSerializerTypeIncompatible() throws Exception {
            runTest("plugins/kotlinx-serialization/testData/diagnostics/SerializerTypeIncompatible.kt");
        }

        @Test
        @TestMetadata("Transients.kt")
        public void testTransients() throws Exception {
            runTest("plugins/kotlinx-serialization/testData/diagnostics/Transients.kt");
        }
    }

    @Nested
    @TestMetadata("plugins/kotlinx-serialization/testData/firMembers")
    @TestDataPath("$PROJECT_ROOT")
    public class FirMembers {
        @Test
        @TestMetadata("abstractAndSealed.kt")
        public void testAbstractAndSealed() throws Exception {
            runTest("plugins/kotlinx-serialization/testData/firMembers/abstractAndSealed.kt");
        }

        @Test
        public void testAllFilesPresentInFirMembers() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/kotlinx-serialization/testData/firMembers"), Pattern.compile("^(.+)\\.kt$"), null, true);
        }

        @Test
        @TestMetadata("classWithCompanionObject.kt")
        public void testClassWithCompanionObject() throws Exception {
            runTest("plugins/kotlinx-serialization/testData/firMembers/classWithCompanionObject.kt");
        }

        @Test
        @TestMetadata("classWithGenericParameters.kt")
        public void testClassWithGenericParameters() throws Exception {
            runTest("plugins/kotlinx-serialization/testData/firMembers/classWithGenericParameters.kt");
        }

        @Test
        @TestMetadata("defaultProperties.kt")
        public void testDefaultProperties() throws Exception {
            runTest("plugins/kotlinx-serialization/testData/firMembers/defaultProperties.kt");
        }

        @Test
        @TestMetadata("enums.kt")
        public void testEnums() throws Exception {
            runTest("plugins/kotlinx-serialization/testData/firMembers/enums.kt");
        }

        @Test
        @TestMetadata("externalSerializers.kt")
        public void testExternalSerializers() throws Exception {
            runTest("plugins/kotlinx-serialization/testData/firMembers/externalSerializers.kt");
        }

        @Test
        @TestMetadata("inlineClasses.kt")
        public void testInlineClasses() throws Exception {
            runTest("plugins/kotlinx-serialization/testData/firMembers/inlineClasses.kt");
        }

        @Test
        @TestMetadata("metaSerializable.kt")
        public void testMetaSerializable() throws Exception {
            runTest("plugins/kotlinx-serialization/testData/firMembers/metaSerializable.kt");
        }

        @Test
        @TestMetadata("multipleProperties.kt")
        public void testMultipleProperties() throws Exception {
            runTest("plugins/kotlinx-serialization/testData/firMembers/multipleProperties.kt");
        }

        @Test
        @TestMetadata("privatePropertiesSerialization.kt")
        public void testPrivatePropertiesSerialization() throws Exception {
            runTest("plugins/kotlinx-serialization/testData/firMembers/privatePropertiesSerialization.kt");
        }

        @Test
        @TestMetadata("serializableObject.kt")
        public void testSerializableObject() throws Exception {
            runTest("plugins/kotlinx-serialization/testData/firMembers/serializableObject.kt");
        }

        @Test
        @TestMetadata("serializableWith.kt")
        public void testSerializableWith() throws Exception {
            runTest("plugins/kotlinx-serialization/testData/firMembers/serializableWith.kt");
        }

        @Test
        @TestMetadata("serializerViaCompanion.kt")
        public void testSerializerViaCompanion() throws Exception {
            runTest("plugins/kotlinx-serialization/testData/firMembers/serializerViaCompanion.kt");
        }
    }
}
