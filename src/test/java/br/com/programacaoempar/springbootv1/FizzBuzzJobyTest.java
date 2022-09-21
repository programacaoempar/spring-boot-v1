package br.com.programacaoempar.springbootv1;

import br.com.programacaoempar.springbootv1.controllers.FizzBuzzJoby;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest(classes = {FizzBuzzJoby.class})
@ExtendWith(SpringExtension.class)
class FizzBuzzJobyTest {

    @Test
    void contextLoads() {
    }

    @Test
    void divsivelPor3() {

        FizzBuzzJoby exercicio = new FizzBuzzJoby();
        assertEquals("Fizz", exercicio.calcula(3));
        assertEquals("Fizz", exercicio.calcula(9));
        assertNotEquals("Fizz", exercicio.calcula(5));
    }

    @Test
    void divisivelPor5() {

        FizzBuzzJoby exercicio = new FizzBuzzJoby();
        assertEquals("Buzz", exercicio.calcula(5));
        assertEquals("Buzz", exercicio.calcula(25));
        assertNotEquals("Buzz", exercicio.calcula(33));

    }

    @Test
    void divisivelPor3Por5() {

        FizzBuzzJoby exercicio = new FizzBuzzJoby();
        assertEquals("FizzBuzz", exercicio.calcula(15));
        assertEquals("FizzBuzz", exercicio.calcula(30));
        assertNotEquals("FizzBuzz", exercicio.calcula(25));

    }

    @Test
    void naoDivisivelNenhum() {

        FizzBuzzJoby exercicio = new FizzBuzzJoby();
        assertEquals("11", exercicio.calcula(11));
        assertEquals("17", exercicio.calcula(17));
        assertNotEquals("21",exercicio.calcula(21));

    }

}