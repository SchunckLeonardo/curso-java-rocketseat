package br.com.leonardorainha.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeirarota")
public class MinhaPrimeiraController {
    
    @GetMapping("/primeirometodo")
    public String primeiraMensagem() {
        return "Funcionou";
    }

}
