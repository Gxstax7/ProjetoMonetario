package spring.controle.monetario.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.controle.monetario.model.Registro;
import spring.controle.monetario.service.RegistroService;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/registros")
public class RegistroController {

    private RegistroService registroService;

    public RegistroController(RegistroService registroService){
        this.registroService = registroService;
    }
        
}
