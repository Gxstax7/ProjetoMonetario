package spring.controle.monetario.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.controle.monetario.model.Devedor;
import spring.controle.monetario.service.DevedorService;

@RestController
@RequestMapping("/devedor")
public class DevedorController {

    DevedorService devedorService;

    public DevedorController(DevedorService devedorService){
        this.devedorService = devedorService;
    }

    @PostMapping("/criarDevedor")
        public Devedor criarDevedor(@RequestBody Devedor devedor){
            return devedorService.criarDevedor(devedor);
        }
    

}
