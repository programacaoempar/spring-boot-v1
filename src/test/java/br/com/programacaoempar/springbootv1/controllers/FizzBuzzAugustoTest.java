package br.com.programacaoempar.springbootv1.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzAugustoTest {

    @Test
    void numeroDivisivelPor3(){

        FizzBuzzAugusto qr = new FizzBuzzAugusto();
        assertEquals("Fizz",qr.executa(3));
        assertEquals("Fizz",qr.executa(9));
        assertNotEquals("Fizz",qr.executa(5));
    }

    @Test
    void numeroDivisivelPor5(){
        FizzBuzzAugusto qr = new FizzBuzzAugusto();
        assertEquals("Buzz", qr.executa(5));
        assertEquals("Buzz", qr.executa(10));
        assertNotEquals("Buzz", qr.executa(3));
    }

    @Test
    void numeroDivisivelPor3E5(){
        FizzBuzzAugusto qr = new FizzBuzzAugusto();
        assertEquals("FizzBuzz", qr.executa(15));
        assertNotEquals("FizzBuzz",qr.executa(25));
    }


}