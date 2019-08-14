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
    private String name;
    private String doorNumber;
    private String streetName;
    private String city;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setDoorNumber(String doorNumber) {
        this.doorNumber = doorNumber;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    
    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
}
