/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.finzy.postofficerevived.methods;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author anusshen
 */
public class StampTest {
    
    public StampTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of values method, of class Stamp.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        Stamp[] expResult = null;
        Stamp[] result = Stamp.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class Stamp.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String arg0 = "";
        Stamp expResult = null;
        Stamp result = Stamp.valueOf(arg0);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrice method, of class Stamp.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Stamp instance = null;
        int expResult = 0;
        int result = instance.getPrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
