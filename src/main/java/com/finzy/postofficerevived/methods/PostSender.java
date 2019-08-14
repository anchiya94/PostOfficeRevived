/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.finzy.postofficerevived.methods;

import com.finzy.postofficerevived.entities.Letter;

/**
 *
 * @author anusshen
 */
enum Stamp{
    INTER_STATE(10),
    INTRA_STATE(5);
    
    private final int price;

    Stamp(int price) {
        this.price = price;
    }
    
    public int getPrice(){
        return this.price;
    }
}


public class PostSender {
    
    private Letter sandesa;
    public boolean isPost;
    public PostSender(Letter sandesa){
         this.sandesa = sandesa;
    }
    
    boolean validateStamp(){
       boolean stampValid = false;
       String sourceState = this.sandesa.getFromAddress().getStateName();
       String destState = this.sandesa.getToAddress().getStateName();
       Stamp stampDecider ;
       int stampPrice;
       if(sourceState.toUpperCase().equals(destState.toUpperCase())){
           stampDecider = Stamp.INTRA_STATE;
       }
       else
           stampDecider = Stamp.INTER_STATE;
       stampPrice = stampDecider.getPrice();
       if (stampPrice == this.sandesa.getStamp())
           stampValid = true;
       return stampValid;
    }
    
    public static void main (String args[]){
       Letter sandesaOriginal = null;
       PostSender sp = new PostSender(sandesaOriginal);
       if(sp.validateStamp())
         System.out.println("Post sent");
       else
          System.out.println("Check the stamp atatched");
    }
    
}
