/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.finzy.postofficerevived.entities;

/**
 *
 * @author anusshen
 */
public class Address {
    String name;
    String doorNumber;
    String streetName;
    String city;
    private String stateName;
    private int pincode;
    
    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getStateName() {
        return stateName;
    }
}
