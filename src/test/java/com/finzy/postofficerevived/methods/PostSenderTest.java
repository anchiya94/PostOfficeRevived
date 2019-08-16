/* Dependency injection of Address class into Letter class;
   Letter class into PostSenderTest class*/
package com.finzy.postofficerevived.methods;

import com.finzy.postofficerevived.entities.Address;
import com.finzy.postofficerevived.entities.Letter;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;


public class PostSenderTest {
    
    public PostSenderTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    @Test
    public void testSendPost_wrongStamp() {
        System.out.println("sendPost-1");
        Address mockedfAddress = Mockito.mock(Address.class);
        Address mockedtAddress = Mockito.mock(Address.class);
        when(mockedfAddress.getStateName()).thenReturn("Karnataka");
        when(mockedtAddress.getStateName()).thenReturn("Sikkim");
        Letter mockedLetter = Mockito.mock(Letter.class);
        when(mockedLetter.getFromAddress()).thenReturn(mockedfAddress);
        when(mockedLetter.getToAddress()).thenReturn(mockedtAddress);
        when(mockedLetter.getStamp()).thenReturn(7);
        PostSender instance = new PostSender(mockedLetter);
        String result = instance.sendPost();
        assertEquals("Stamp atatched is of insufficient value", result);    
    }
    @Test
    public void testSendPost_rightStamp() {
        System.out.println("sendPost-2");
        Address mockedfAddress = Mockito.mock(Address.class);
        Address mockedtAddress = Mockito.mock(Address.class);
        when(mockedfAddress.getStateName()).thenReturn("Karnataka");
        when(mockedtAddress.getStateName()).thenReturn("Sikkim");
        Letter mockedLetter = Mockito.mock(Letter.class);
        when(mockedLetter.getFromAddress()).thenReturn(mockedfAddress);
        when(mockedLetter.getToAddress()).thenReturn(mockedtAddress);
        when(mockedLetter.getStamp()).thenReturn(20);
        PostSender instance = new PostSender(mockedLetter);
        String result = instance.sendPost();
        assertEquals("Post sent", result);    
    }
    @Test
    public void testSendPost_rightStamp1() {
        System.out.println("sendPost-3");
        Address mockedfAddress = Mockito.mock(Address.class);
        Address mockedtAddress = Mockito.mock(Address.class);
        when(mockedfAddress.getStateName()).thenReturn("Karnataka");
        when(mockedtAddress.getStateName()).thenReturn("Karnataka");
        Letter mockedLetter = Mockito.mock(Letter.class);
        when(mockedLetter.getFromAddress()).thenReturn(mockedfAddress);
        when(mockedLetter.getToAddress()).thenReturn(mockedtAddress);
        when(mockedLetter.getStamp()).thenReturn(20);
        PostSender instance = new PostSender(mockedLetter);
        String result = instance.sendPost();
        assertEquals("Post sent", result);    
    }
    
}
