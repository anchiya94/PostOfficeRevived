/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.finzy.postofficerevived.entities;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author anusshen
 */
public class LetterTest {
    
    public LetterTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of getStamp method, of class Letter.
     */
    @Test
    public void testGetStamp() {
        System.out.println("getStamp");
        Letter instance = new Letter();
        int expResult = 0;
        int result = instance.getStamp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFromAddress method, of class Letter.
     */
    @Test
    public void testGetFromAddress() {
        System.out.println("getFromAddress");
        Letter instance = new Letter();
        Address expResult = null;
        Address result = instance.getFromAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getToAddress method, of class Letter.
     */
    @Test
    public void testGetToAddress() {
        System.out.println("getToAddress");
        Letter instance = new Letter();
        Address expResult = null;
        Address result = instance.getToAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLetterContent method, of class Letter.
     */
    @Test
    public void testGetLetterContent() {
        System.out.println("getLetterContent");
        Letter instance = new Letter();
        String expResult = "";
        String result = instance.getLetterContent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFromAddress method, of class Letter.
     */
    @Test
    public void testSetFromAddress() {
        System.out.println("setFromAddress");
        Address fromAddress = null;
        Letter instance = new Letter();
        instance.setFromAddress(fromAddress);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setToAddress method, of class Letter.
     */
    @Test
    public void testSetToAddress() {
        System.out.println("setToAddress");
        Address toAddress = null;
        Letter instance = new Letter();
        instance.setToAddress(toAddress);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStamp method, of class Letter.
     */
    @Test
    public void testSetStamp() {
        System.out.println("setStamp");
        int stamp = 0;
        Letter instance = new Letter();
        instance.setStamp(stamp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLetterContent method, of class Letter.
     */
    @Test
    public void testSetLetterContent() {
        System.out.println("setLetterContent");
        String letterContent = "";
        Letter instance = new Letter();
        instance.setLetterContent(letterContent);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
