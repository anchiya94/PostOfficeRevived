/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.finzy.postofficerevived.entities;



public class Letter {
    private Address fromAddress;
    private Address toAddress;
    private int stamp;
    private String letterContent;
    
    public int getStamp() {
        return stamp;
    }
    public Address getFromAddress() {
        return fromAddress;
    }

    public Address getToAddress() {
        return toAddress;
    }
    
    public String getLetterContent() {
        return letterContent;
    }

    public void setFromAddress(Address fromAddress) {
        this.fromAddress = fromAddress;
    }

    public void setToAddress(Address toAddress) {
        this.toAddress = toAddress;
    }

    public void setStamp(int stamp) {
        this.stamp = stamp;
    }

    public void setLetterContent(String letterContent) {
        this.letterContent = letterContent;
    }
     
}
