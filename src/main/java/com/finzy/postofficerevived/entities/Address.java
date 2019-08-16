/*
 * 
 */
package com.finzy.postofficerevived.entities;

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
    
    public String toString(){
        
        return "\t\t"+this.name+",\n\t\t"+this.doorNumber+",\n\t\t"+this.streetName+",\n\t\t"+this.city+",\n\t\t"+this.stateName+"-"+this.pincode;
        
    }
}
