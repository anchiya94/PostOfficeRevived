/*
 * To change this license header, choose License Headers in Project Properties.
 */
package com.finzy.postofficerevived.methods;
import com.finzy.postofficerevived.entities.Address;
import com.finzy.postofficerevived.entities.Letter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class LetterComposer
{
    private static void getAddress(BufferedReader input,Letter myLetter,String addressType) throws IOException{
       //handle empty input scenarios
       Address myAddress=new Address();
       System.out.println("Name:");
       myAddress.setName(input.readLine());
       System.out.println("Door number/Flat number and House Name/Building Name:");
       myAddress.setDoorNumber(input.readLine());
       System.out.println("Street Name:");
       myAddress.setStreetName(input.readLine());
       System.out.println("City:");
       myAddress.setCity(input.readLine());
       System.out.println("State:");
       myAddress.setStateName(input.readLine());
       System.out.println("Pincode:");
       myAddress.setPincode(Integer.parseInt(input.readLine()));      
       if (addressType.equals("from"))
           myLetter.setFromAddress(myAddress);
       else
           myLetter.setToAddress(myAddress);

    }
    
    
    public static void main(String[] args) throws IOException
    {
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       int menuChoice = 5;
       ArrayList<Letter> letters = new ArrayList<Letter>();
       int counter = 0;
       do {
           System.out.println("\t\t\tPost Office Revived");
           System.out.println("\t\t1. Compose Letter\t2. Review Letter\t3. Edit Letter\t4. Send Letter\t5. I am done");
           try {
               System.out.println("Enter a choice: ");
               menuChoice = Integer.parseInt(input.readLine());
           } catch (NumberFormatException e) {
               System.out.println("Stick to the choices, please");
           }

           switch (menuChoice)
           {case 1:
            {   
               Letter myletter = new Letter();
               System.out.println("From Address-->");
               getAddress(input,myletter,"from");
               System.out.println("To Address-->");
               getAddress(input,myletter,"to");
               int attempts = 3;
               do{
                   try {
                       System.out.println("Stamp price:");
                       int price = Integer.parseInt(input.readLine());
                       myletter.setStamp(price);
                       break;
                   } catch (NumberFormatException e) {
                       System.out.println("Enter a number!");
                       //give a message saying these many attempts left
                       attempts--;
                   }
               }while(attempts>0);
               System.out.println("Letter content:");
               myletter.setLetterContent(input.readLine());
               letters.add(myletter);
               counter++;
               break;
           }  
           case 2:
           {
               
               break;
           }
           case 3:
           {
               break;
           }
           case 4:
           {
               Letter letterToSend = letters.get(counter-1);
               PostSender ps = new PostSender(letterToSend);
               ps.sendPost();
               break;
           } 
           default: {
               System.out.println("Enter a valid choice");
           }
           }
       } while (menuChoice !=5 );
    }
}
