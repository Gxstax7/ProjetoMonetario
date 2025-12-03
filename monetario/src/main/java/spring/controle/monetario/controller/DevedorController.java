package spring.controle.monetario.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.controle.monetario.model.Devedor;
import spring.controle.monetario.service.DevedorService;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@CrossOrigin(origins = "*")
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
    
    @GetMapping("/listarDevedores/{id}")
        public Optional<Devedor> buscarDevedor(@PathVariable long id){
            return devedorService.buscarDevedor(id);
        }
    

    @GetMapping("/listarDevedores")
        public List<Devedor> buscaGeral(){
            return devedorService.mostrarDevedores();
        }
    

    @DeleteMapping("/excluirDevedor/{id}")
        public ResponseEntity<Void> deletarDevedor(@PathVariable long id){
            return devedorService.deletarDevedor(id);
        }

    @GetMapping("/atualizarDevedor/{id}")
        public ResponseEntity<Void> atualizarDevedor(@RequestBody Devedor devedor, @PathVariable long id) {
            return devedorService.atualizarDevedor(devedor, id);   
        }
    

}