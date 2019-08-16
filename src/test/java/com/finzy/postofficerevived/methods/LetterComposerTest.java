
package com.finzy.postofficerevived.methods;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LetterComposerTest {
    
      
    @Test
    public void testMain_input2() throws Exception {
       final ByteArrayOutputStream outContent = new ByteArrayOutputStream(); 
       final PrintStream originalOut = System.out;
       System.setOut(new PrintStream(outContent));
       String simulatedUserInput = "2" + System.getProperty("line.separator")
    + "5" + System.getProperty("line.separator");

       InputStream savedStandardInputStream = System.in;
       System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));
       String[] args = null;
       LetterComposer.main(args);
       assertTrue(outContent.toString().contains("You have no letter to review. Please compose a letter first"));
       System.setIn(savedStandardInputStream);
       System.setOut(originalOut);
        
    }
    
    @Test
    public void testMain_input3() throws Exception {
       final ByteArrayOutputStream outContent = new ByteArrayOutputStream(); 
       final PrintStream originalOut = System.out;
       System.setOut(new PrintStream(outContent));
       String simulatedUserInput = "3" + System.getProperty("line.separator")
    + "5" + System.getProperty("line.separator");

       InputStream savedStandardInputStream = System.in;
       System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));
       String[] args = null;
       LetterComposer.main(args);
       assertTrue(outContent.toString().contains("You have no letter to edit. Please compose a letter first"));
       System.setIn(savedStandardInputStream);
       System.setOut(originalOut);
        
    }
    
    public void testMain_input4() throws Exception {
       final ByteArrayOutputStream outContent = new ByteArrayOutputStream(); 
       final PrintStream originalOut = System.out;
       System.setOut(new PrintStream(outContent));
       String simulatedUserInput = "4" + System.getProperty("line.separator")
    + "5" + System.getProperty("line.separator");

       InputStream savedStandardInputStream = System.in;
       System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));
       String[] args = null;
       LetterComposer.main(args);
       assertTrue(outContent.toString().contains("You have no letter to send. Please compose a letter first"));
       System.setIn(savedStandardInputStream);
       System.setOut(originalOut);
        
    }
    
}
