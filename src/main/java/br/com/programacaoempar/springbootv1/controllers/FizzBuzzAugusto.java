package br.com.programacaoempar.springbootv1.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/augusto/fizzbuzz")
public class FizzBuzzAugusto {


    @GetMapping
    public String executa(){
        return "OK";
    }

}
