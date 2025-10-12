package spring.controle.monetario.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import spring.controle.monetario.model.Usuario;
import spring.controle.monetario.repository.UsuarioRepository;

@Service
public class UsuarioService {

    private UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario criarUsuario (Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> listarUsuarios (){
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> buscarUsuario (Long id){
        return usuarioRepository.findById(id);
    }

    public ResponseEntity<Void> deletarUsuario(Long id){
        if(!usuarioRepository.existsById(id)){
            return ResponseEntity.notFound().build();
        }else{
            usuarioRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
    }

    public ResponseEntity<Void> atualizarUsuario(Usuario usuarioAtualizado, Long id){
        if(!usuarioRepository.existsById(id)){
            return ResponseEntity.notFound().build();
        }else{
            Usuario aux = usuarioRepository.findById(id).get();
            aux = usuarioAtualizado;
            usuarioRepository.save(usuarioAtualizado);
            return ResponseEntity.noContent().build();
        }
    }

}
