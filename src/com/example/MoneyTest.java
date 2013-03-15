package com.example;

import org.junit.After;
import org.junit.Before;
import junit.framework.TestCase;

public class MoneyTest extends TestCase {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    public void testMultiplication(){
        Dollar five = new Dollar(5);
        assertEquals(new Dollar(10),five.times(2));
        assertEquals(new Dollar(15),five.times(3));
    }

    public void testEquality(){
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
        assertTrue(new Franc(5).equals(new Franc(5)));
        assertFalse(new Franc(5).equals(new Franc(6)));

        assertFalse(new Franc(5).equals(new Dollar(5)));
    }

    public void testFrancMultiplication(){
        Franc five = new Franc(5);
        assertEquals(new Franc(10),five.times(2));
        assertEquals(new Franc(15),five.times(3));
    }
}
