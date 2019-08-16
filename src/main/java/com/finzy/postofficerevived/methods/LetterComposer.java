/*
 * Class that maintains the code as to which options are to be provided to the user 
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
    private static void putMetoSleep(int seconds){
       try        
       {
          Thread.sleep(1000*seconds);
       } 
       catch(InterruptedException ex) 
       {
          Thread.currentThread().interrupt();
       }
    }
    
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
       System.out.println("=======================================================================");
       System.out.println("\t\t\tWelcome to Post Office Revived");
       System.out.println("=======================================================================");
       do {
           System.out.println("Following are your choices");
           System.out.println("1. Compose Letter\n2. Review Letter\n3. Edit Letter\n4. Send Letter\n5. I am done");
           try {
               System.out.println("Enter a choice: ");
               menuChoice = Integer.parseInt(input.readLine());
           } catch (NumberFormatException e) {
               System.out.println("Stick to the choices, please");
               continue;
           }

           switch (menuChoice)
           {case 1:
            {   
               Letter myletter = new Letter();
               System.out.println("Please note that the minimum stamp price for within state post exchange is Rs:"+Stamp.INTRA_STATE.getPrice()+" across state boundries is Rs:"+Stamp.INTER_STATE.getPrice());
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
               StringBuilder letterContent = new StringBuilder(1000);
               String s;
               while ((s = input.readLine()) != null && s.length() != 0) {
                  letterContent.append (s+"\n");
               }
               myletter.setLetterContent(letterContent.toString());
               letters.add(myletter);
               counter++;
               break;
           }  
           case 2:
           {
               try
               {
                  Letter letterToPrint = letters.get(counter-1);
                  printMyLetter(letterToPrint);
                  break;
               }
               catch(IndexOutOfBoundsException e){
                  System.out.println("You have no letter to review. Please compose a letter first");
                  putMetoSleep(1);
                  break;
               }
           }
           case 3:
           {   
               try{
                  Letter letterToEdit = letters.get(counter-1);
                  int editChoice = 5;
                  System.out.println("Pick a field you want to edit");
                  do{
                     System.out.println("1. From Address\n2. To Address\n3. Stamp price\n4. Letter content\n5. Lock the edit and return to previous menu");
                     try{
                        System.out.println("Enter a choice: ");
                        editChoice = Integer.parseInt(input.readLine());
                     }catch (NumberFormatException e) {
                        System.out.println("Stick to the choices, please");
                        continue;
                     }
                     switch(editChoice){
                     case 1:{
                        System.out.println("From Address-->");
                        getAddress(input,letterToEdit,"from");
                        break;
                     } 
                     case 2:{
                        System.out.println("To Address-->");
                        getAddress(input,letterToEdit,"to");
                        break;
                     }
                     case 3:{
                        int attempts = 3;
                        do{
                           try {
                              System.out.println("Stamp price:");
                              int price = Integer.parseInt(input.readLine());
                              letterToEdit.setStamp(price);
                              break;
                           } catch (NumberFormatException e) {
                              System.out.println("Enter a number!");
                              //give a message saying these many attempts left
                              attempts--;
                     }
                     }while(attempts>0);
                        break;
                     }
                     case 4:{
                        System.out.println("Letter content:");
                        StringBuilder letterContent = new StringBuilder(1000);
                        String s;
                        while ((s = input.readLine()) != null && s.length() != 0) {
                        letterContent.append (s+"\n");
                        }
                        letterToEdit.setLetterContent(letterContent.toString());
                        break;
                     }
                     case 5:{
                        System.out.println("Changes saved");
                        break;
                     }
                     default:{
                        System.out.println("Enter a valid choice");
                        putMetoSleep(1); 
                     }
                  }
               }
               while(editChoice !=5);
                  break;
               }
               catch(IndexOutOfBoundsException ax){
                  System.out.println("You have no letter to edit. Please compose a letter first");
                  putMetoSleep(1);
                  break;  
               }
               
           }
           case 4:
           {
               try{
                  Letter letterToSend = letters.get(counter-1);
                  PostSender ps = new PostSender(letterToSend);
                  System.out.println(ps.sendPost());
                  putMetoSleep(1);
                  break;
               }
               catch(IndexOutOfBoundsException ax){
                  System.out.println("You have no letter to send. Please compose a letter first");
                  putMetoSleep(1);
                  break;  
               }
               
           } 
           case 5:
           {
               System.out.println("Thank you for using Post Office Revived");
               putMetoSleep(1);
               break;
           }
           default: {
               System.out.println("Enter a valid choice");
               putMetoSleep(1);
           }
           }
       } while (menuChoice !=5 );
    }

    private static void printMyLetter(Letter letterToPrint) {
       Address gAddress = null;
       StringBuilder myWrittenLetter = new StringBuilder(10000);
       myWrittenLetter.append("-----------------------\n");
       myWrittenLetter.append("From Address:\n");
       gAddress = letterToPrint.getFromAddress();
       myWrittenLetter.append(gAddress.toString());
       myWrittenLetter.append("\nLetter Body:\n");
       myWrittenLetter.append(letterToPrint.getLetterContent());
       myWrittenLetter.append("\nStamp applied: Rs "+letterToPrint.getStamp()+"\n");
       myWrittenLetter.append("To Address:\n");
       gAddress = letterToPrint.getToAddress();
       myWrittenLetter.append(gAddress.toString());
       System.out.println(myWrittenLetter);
    }
}
