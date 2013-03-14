package com.example;

import org.junit.After;
import org.junit.Before;
import junit.framework.TestCase;

/**
 * Created with IntelliJ IDEA.
 * User: fsmsolutions
 * Date: 3/14/13
 * Time: 1:20 AM
 * To change this template use File | Settings | File Templates.
 */
public class MoneyTest extends TestCase {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    public void testMultiplication(){

        Dollar five = new Dollar(5);
        five.times(2);

        assertEquals(10,five.amount);


    }
}
