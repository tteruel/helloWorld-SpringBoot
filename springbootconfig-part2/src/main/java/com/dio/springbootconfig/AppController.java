package com.dio.springbootconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Value("${app.message}") //Não é o Value do Lombook, é um annotation
    private String appMessage;

    @GetMapping("/") // aqui vai pegar a partir do localhost:8080/ essa mensagem.
    public String getAppMessage(){
        return appMessage;
    }

}
