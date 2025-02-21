package com.appdeveloper.app.ws.mobile_app_ws;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class StringReversalTest {
    private static StringReversal stringReversal;

    @Test
    void testReverse() {
        assertEquals("01001", stringReversal.reverse("10010"), "the excepted value is not same as input");
    }

    @BeforeAll
    static void testBefore(){
        String input="";
        assertNotNull(stringReversal.reverse(input),"input cannot be kept null");
    }

    @Test
    void testReverse2(){

        assertEquals("",stringReversal.reverse(""),"Please enter the input");
    }
}