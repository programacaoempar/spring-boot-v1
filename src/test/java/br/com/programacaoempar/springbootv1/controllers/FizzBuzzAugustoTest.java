package br.com.programacaoempar.springbootv1.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzAugustoTest {

    FizzBuzzAugusto FizzBuzz;

    @BeforeEach
    void init() {
        FizzBuzz = new FizzBuzzAugusto();
    }

    @Test
    void numeroDivisivelPor3(){
        assertEquals("Fizz", FizzBuzz.executa(3));
        assertEquals("Fizz", FizzBuzz.executa(9));
        assertNotEquals("Fizz", FizzBuzz.executa(5));
    }

    @Test
    void numeroDivisivelPor5(){
        assertEquals("Buzz", FizzBuzz.executa(5));
        assertEquals("Buzz", FizzBuzz.executa(10));
        assertNotEquals("Buzz", FizzBuzz.executa(3));
    }

    @Test
    void numeroDivisivelPor3E5(){
        assertEquals("FizzBuzz", FizzBuzz.executa(15));
        assertNotEquals("FizzBuzz", FizzBuzz.executa(25));
    }

    @Test
    void numeroNaoDivisivel(){
        assertEquals("62",FizzBuzz.executa(62));
    }


}