package org.Power;

public class Power {
    int naivePower(int base, int exponent) {
        if (base == 0)
            return 0;
        if (exponent == 0)
            return 1;
        return base*naivePower(base, exponent-1);
    }

    int unoptimizedPower(int base, int exponent) {
        if (base == 0)
            return 0;
        if (exponent == 0)
            return 1;
        if (exponent%2==0){
            return unoptimizedPower(base, exponent/2)*unoptimizedPower(base, exponent/2);
        } else {
            return base*unoptimizedPower(base, exponent/2)*unoptimizedPower(base, exponent/2);
        }
    }

    int optimizedPower(int base, int exponent) {
        if (base == 0)
            return 0;
        if (exponent == 0)
            return 1;

        int temp = optimizedPower(base, exponent/2);
        if (exponent%2==0){
            return temp*temp;
        } else {
            return base*temp*temp;
        }
    }
}
