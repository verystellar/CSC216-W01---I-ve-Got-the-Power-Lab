package org.Power;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;




class powerTest {
    Power pow;
    @BeforeEach
    void setUp() {
        pow = new Power();
    }

    @Test
    void test() {
        assertEquals(8,pow.naivePower(2,3));
        assertEquals(0,pow.naivePower(0,2));
        assertEquals(1,pow.naivePower(10,0));
        assertEquals(1,pow.naivePower(1,1));
        assertEquals(8,pow.unoptimizedPower(2,3));
        assertEquals(0,pow.unoptimizedPower(0,2));
        assertEquals(1,pow.unoptimizedPower(10,0));
        assertEquals(1,pow.unoptimizedPower(1,1));
        assertEquals(8,pow.optimizedPower(2,3));
        assertEquals(0,pow.optimizedPower(0,2));
        assertEquals(1,pow.optimizedPower(10,0));
        assertEquals(1,pow.optimizedPower(1,1));

    }
}
