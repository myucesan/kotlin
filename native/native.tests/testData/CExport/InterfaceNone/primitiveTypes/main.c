#include <stdint.h>
#undef NDEBUG // Make sure that asserts are enabled.
#include <assert.h>
#include <math.h>

#define DECLARE_ADDER(TIn, TOut) \
    TOut add_##TIn(TIn a, TIn b)

DECLARE_ADDER(int8_t, int32_t);
DECLARE_ADDER(int16_t, int32_t);
DECLARE_ADDER(int32_t, int32_t);
DECLARE_ADDER(int64_t, int64_t);

DECLARE_ADDER(uint8_t, uint32_t);
DECLARE_ADDER(uint16_t, uint32_t);
DECLARE_ADDER(uint32_t, uint32_t);
DECLARE_ADDER(uint64_t, uint64_t);

DECLARE_ADDER(float, float);
DECLARE_ADDER(double, double);

float float_nan();
double double_nan();

_Bool logical_or(_Bool a, _Bool b);

int main() {
    assert((int8_t)add_int8_t(1, 1) == 2);
    assert((int16_t)add_int16_t(1, 1) == 2);
    assert(add_int32_t(1, 1) == 2);
    assert(add_int32_t(1, 1) == 2);

    assert((uint8_t)add_uint8_t(1, 1) == 2);
    assert((uint16_t)add_uint16_t(1, 1) == 2);
    assert(add_uint32_t(1, 1) == 2);
    assert(add_uint32_t(1, 1) == 2);

    assert((int8_t)add_int8_t(INT8_MAX, 1) == INT8_MIN);
    assert((int16_t)add_int16_t(INT16_MAX, 1) == INT16_MIN);
    assert(add_int32_t(INT32_MAX, 1) == INT32_MIN);
    assert(add_int64_t(INT64_MAX, 1) == INT64_MIN);

    assert((uint8_t)add_uint8_t(UINT8_MAX, 1) == 0);
    assert((uint16_t)add_uint16_t(UINT16_MAX, 1) == 0);
    assert(add_uint32_t(UINT32_MAX, 1) == 0);
    assert(add_uint64_t(UINT64_MAX, 1) == 0);

    assert(logical_or(1, 1) == 1);
    assert(logical_or(0, 1) == 1);

    assert(add_float(3.0, -3.0) == 0.0);
    assert(add_double(3.0, -3.0) == 0.0);

    assert(add_float(3.0, -3.0) == 0.0);
    assert(add_double(3.0, -3.0) == 0.0);

    assert(isnan(float_nan()));
    assert(isnan(double_nan()));
}