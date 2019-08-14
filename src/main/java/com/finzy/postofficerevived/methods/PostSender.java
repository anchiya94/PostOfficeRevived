/*
 * Validates the eligiblity to send post based on the stamp attached by the sender
 */
package com.finzy.postofficerevived.methods;

import com.finzy.postofficerevived.entities.Letter;

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
    
    private final Letter sandesa;
    PostSender(Letter sandesa){
         this.sandesa = sandesa;
    }
    
    private boolean validateStamp(){
       boolean stampValid = false;
       String sourceState = this.sandesa.getFromAddress().getStateName();
       String destState = this.sandesa.getToAddress().getStateName();
       Stamp stampDecider ;
       int stampPrice;
       if(sourceState.toUpperCase().equals(destState.toUpperCase())){
           stampDecider = Stamp.INTRA_STATE;
           stampPrice = stampDecider.getPrice();
           if (this.sandesa.getStamp()>= stampPrice)
               stampValid = true;
       }
       else{
           stampDecider = Stamp.INTER_STATE;
           stampPrice = stampDecider.getPrice();
           if (this.sandesa.getStamp() == stampPrice)
               stampValid = true;
       }
       
       return stampValid;
    }
    
    void sendPost(){
        if(validateStamp())
           System.out.println("Post sent");
        else
           System.out.println("Check the stamp atatched");
        
    }
}
