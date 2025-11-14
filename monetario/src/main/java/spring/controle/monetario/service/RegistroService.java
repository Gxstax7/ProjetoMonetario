package spring.controle.monetario.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import spring.controle.monetario.model.Registro;
import spring.controle.monetario.repository.RegistroRepository;

@Service
public class RegistroService {

    private final RegistroRepository registroRepository;

    public RegistroService(RegistroRepository registroRepository) {
        this.registroRepository = registroRepository;
    }

    public List <Registro> listarRegistros (){
        return registroRepository.findAll();
    }

    public Optional <Registro> buscarRegistro (Long id){
        return registroRepository.findById(id);
    }

    //TODO: Criar busca de registro por idBanco e idUsuario

    public Registro criaRegistro (Registro registro){
        return registroRepository.save(registro);
    }

    public ResponseEntity<Void> deletarRegistro (Long id){
        if (registroRepository.existsById(id)) {
            registroRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<Void> atualizarRegistro (Long id, Registro registroAtt){
        if (registroRepository.existsById(id)) {
            Registro aux = registroRepository.findById(id).get();
            aux = registroAtt;
            registroRepository.save(aux);
            return ResponseEntity.noContent().build();
        }else{
            return ResponseEntity.notFound().build();
        }
    }
    

}
