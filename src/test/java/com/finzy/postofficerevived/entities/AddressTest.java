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
public class AddressTest {
    
    public AddressTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    /*
    @Test
    public void testGetPincode() {
        System.out.println("getPincode");
        Address instance = new Address();
        int expResult = 0;
        int result = instance.getPincode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetPincode() {
        System.out.println("setPincode");
        int pincode = 0;
        Address instance = new Address();
        instance.setPincode(pincode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testGetStateName() {
        System.out.println("getStateName");
        Address instance = new Address();
        String expResult = "";
        String result = instance.getStateName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Address instance = new Address();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testSetDoorNumber() {
        System.out.println("setDoorNumber");
        String doorNumber = "";
        Address instance = new Address();
        instance.setDoorNumber(doorNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

   
    @Test
    public void testSetStreetName() {
        System.out.println("setStreetName");
        String streetName = "";
        Address instance = new Address();
        instance.setStreetName(streetName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testSetCity() {
        System.out.println("setCity");
        String city = "";
        Address instance = new Address();
        instance.setCity(city);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testSetStateName() {
        System.out.println("setStateName");
        String stateName = "";
        Address instance = new Address();
        instance.setStateName(stateName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
   
    @Test
    public void testToString() {
        System.out.println("toString");
        Address instance = new Address();
        String expResult = "John,\n#2,\nVincent Street,\nBangalore,\nKarnataka-560029";
        instance.setName("John");
        instance.setDoorNumber("#2");
        instance.setStreetName("Vincent Street");
        instance.setCity("Bangalore");
        instance.setStateName("Karnataka");
        instance.setPincode(560029);
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
