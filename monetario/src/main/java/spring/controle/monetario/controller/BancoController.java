package spring.controle.monetario.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.controle.monetario.model.Banco;
import spring.controle.monetario.service.BancoService;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/bancos")
public class BancoController {

    BancoService bancoService;

    public BancoController(BancoService bancoService) {
        this.bancoService = bancoService;
    }

    @PostMapping("/criarBanco")
    public Banco postMethodName(@RequestBody Banco banco) {
        return bancoService.criarBanco(banco);
    }

    @GetMapping("/listarBancos")
    public List <Banco> buscaGeral() {
        return bancoService.mostrarBancos();
    }

    @GetMapping("/listarBanco/{id}")
    public Optional<Banco> buscarBanco(@PathVariable Long id) {
        return bancoService.buscarBanco(id);
    }
    

    @DeleteMapping("/deletarBanco/{id}")
    public ResponseEntity<Void> deletarBanco(@PathVariable Long id) {
        return bancoService.deletarBanco(id);
   } 
    
   @PostMapping("/atualizarBanco/{id}")
   public ResponseEntity<Void> atualizaBanco(@PathVariable Long id, @RequestBody Banco banco) {
        return bancoService.updateBanco(id, banco);
   }
   

}