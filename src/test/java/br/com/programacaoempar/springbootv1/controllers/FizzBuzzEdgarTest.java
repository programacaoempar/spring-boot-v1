package br.com.programacaoempar.springbootv1.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzEdgarTest {

    FizzBuzzEdgar FB;

    @BeforeEach
    void init() { FB = new FizzBuzzEdgar(); }

    @Test
    void testaFizz(){
        assertEquals("Fizz", FB.executaFizzBuzz(3));
        assertEquals("Fizz", FB.executaFizzBuzz(6));
        assertNotEquals("Fizz", FB.executaFizzBuzz(10));
    }

    @Test
    void testaBuzz(){
        assertEquals("Buzz", FB.executaFizzBuzz(5));
        assertEquals("Buzz", FB.executaFizzBuzz(10));
        assertNotEquals("Buzz", FB.executaFizzBuzz(12));
    }

    @Test
    void testaFizzBuzz(){
        assertEquals("FizzBuzz", FB.executaFizzBuzz(15));
        assertEquals("FizzBuzz", FB.executaFizzBuzz(30));
        assertNotEquals("FizzBuzz", FB.executaFizzBuzz(31));
    }

    @Test
    void testaNaoFizzBuzz(){
        assertEquals("4", FB.executaFizzBuzz(4));
        assertEquals("22", FB.executaFizzBuzz(22));
        assertNotEquals("31", FB.executaFizzBuzz(30));
    }

}
