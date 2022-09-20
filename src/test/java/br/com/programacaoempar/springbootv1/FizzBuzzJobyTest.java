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
	void divsivelPor3(){

		FizzBuzzJoby exercicio = new FizzBuzzJoby();
		assertEquals("Fizz", exercicio.calcula(3));
		assertEquals("Fizz", exercicio.calcula(9));
		assertNotEquals("Fizz", exercicio.calcula(5));
	}

}
