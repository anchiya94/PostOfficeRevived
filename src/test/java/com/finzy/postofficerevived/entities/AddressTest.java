
package com.finzy.postofficerevived.entities;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AddressTest {
    
    public AddressTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @Test
    public void testToString() {
        System.out.println("toString");
        Address instance = new Address();
        String expResult = "\t\tJohn,\n\t\t#2,\n\t\tVincent Street,\n\t\tBangalore,\n\t\tKarnataka-560029";
        instance.setName("John");
        instance.setDoorNumber("#2");
        instance.setStreetName("Vincent Street");
        instance.setCity("Bangalore");
        instance.setStateName("Karnataka");
        instance.setPincode(560029);
        String result = instance.toString();
        assertEquals(expResult, result);
          
    }
    
}
