/*
20 March 2022 : 29. Divide Two Integers [Ordered Ray-Ban Men's Sunglass]
Given two integers dividend and divisor, divide two integers without using multiplication, division, and mod operator.

The integer division should truncate toward zero, which means losing its fractional part. For example, 8.345 would be truncated to 8, and -2.7335 would be truncated to -2.

Return the quotient after dividing dividend by divisor.

Note: Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [−231, 231 − 1]. For this problem, if the quotient is strictly greater than 231 - 1, then return 231 - 1, and if the quotient is strictly less than -231, then return -231.
*/
class divideWithBit {
    public int divide(int dividend, int divisor) {
        // base cases
        if(dividend == 0) return 0;
        if(divisor == 1) return dividend;
        
        // turn negative divisor to positive divisor
        if(divisor < 0) {
            // edge case
            if(divisor == Integer.MIN_VALUE) {
                // for -2^32, only -2^32 will get 1
                return dividend == Integer.MIN_VALUE ? 1 : 0;
            }
            // edge case, -2^32 / -1 => 2^32 - 1
            if(divisor == -1 && dividend == Integer.MIN_VALUE) {
                return Integer.MAX_VALUE;
            }
            return -divide(dividend, -divisor);
        }
        
        // turn negative dividend to positive dividend
        if(dividend < 0) {
            // add one to word around -2^32
            int added = dividend + divisor;
            if(added > 0) return 0; // less than divisor
            
            return -1 - divide(-added, divisor);
        }
        
        // finally, all positive case
        if(dividend < divisor) return 0;
        
        /*
        the idea is to find a 2 based number n
        
        dividend / n >= divisor
        
        dividend >= divisor * n
        dividend = divisor * n + remaining
        dividend = divisor * n + divisor * x
        
        what we want is (n + x), and
        
        remaining = dividend - divisor * n
        
        so the result is n + divide(dividend - divisor * n, divisor)
        */
        int m = dividend;
        int bits = 0;
        // to reduce the dividend is safer because there is no overflow problem
        while((m >> 1) >= divisor) {
            bits++;
            m >>= 1;
        }
        return (1 << bits) + divide(dividend - (divisor << bits) , divisor);
    }
}
