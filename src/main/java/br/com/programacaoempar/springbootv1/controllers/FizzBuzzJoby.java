package br.com.programacaoempar.springbootv1.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/augusto/fizzbuzz/{numero}")
public class FizzBuzzJoby {


    //primeira regra: se o numero devisivel por 3 retorna fizz
    //segunda regra: se o numero divisivel por 5 retorna buzz
    //terceira regra: se o numero divisivel por 3 e por 5 retorna fizzbuzz
    //quarta regra: se o numero nao é divisivel por nenhum deles retorna o numero recebido
    @GetMapping
    public String executa(@PathVariable("numero") Integer numero) {
        return String.valueOf(numero);
    }

    public String calcula(int numero) {
        StringBuilder div = new StringBuilder();
        if (numero % 3 == 0) {
            div.append("Fizz");
        }if (numero % 5 == 0){
            div.append("Buzz");
        }
        return div.toString();
    }
}
