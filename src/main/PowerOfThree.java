package main;

public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        if (n < 1) return false;
        while (n != 1) {
            if (n % 3 != 0) return false;
            n /= 3;
        }
        return true;
    }

    // return n > 0 && 1162261467 % n == 0;
}
