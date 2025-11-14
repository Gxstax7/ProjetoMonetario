package spring.controle.monetario.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.controle.monetario.model.Usuario;
import spring.controle.monetario.service.UsuarioService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    @PostMapping("/criarUsuario")
    public Usuario criarUsuario(@RequestBody Usuario usuario) {
        return usuarioService.criarUsuario(usuario);
    }

    @GetMapping("/listarUsuarios")
    public List<Usuario> listarUsuarios() {
        return usuarioService.listarUsuarios();
    }
    
    @GetMapping("/listarUsuarios/{id}")
    public Optional<Usuario> buscarUsuario(@PathVariable Long id){
        return usuarioService.buscarUsuario(id);
    }
    
    @DeleteMapping("deletarUsuario/{id}")
    public ResponseEntity<Void> excluirUsuario(@PathVariable Long id){
        return usuarioService.deletarUsuario(id);
    }

    @PostMapping("/atualizarUsuario/{id}")
    public ResponseEntity<Void> atualizarUsuario(@PathVariable Long id, @RequestBody Usuario usuario){
        return usuarioService.atualizarUsuario(usuario, id);
    }

}
