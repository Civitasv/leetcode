package test;

import main.NumbersAtMostNGivenDigitSet;
import org.junit.jupiter.api.Test;

class NumbersAtMostNGivenDigitSetTest {

    @Test
    void test() {
        NumbersAtMostNGivenDigitSet set = new NumbersAtMostNGivenDigitSet();
        System.out.println(set.length(100));
    }
}