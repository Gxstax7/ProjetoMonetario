package spring.controle.monetario.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ResponseBody;

import spring.controle.monetario.model.Devedor;
import spring.controle.monetario.repository.DevedorRepository;

public class DevedorService {

    private DevedorRepository devedorRepository;

    public DevedorService(DevedorRepository devedorRepository){
        this.devedorRepository = devedorRepository;
    }

    public List<Devedor> mostrarDevedores(){
        return devedorRepository.findAll();
    }

    public Devedor criaDevedor(Devedor devedor){
        return devedorRepository.save(devedor);
    }

    public Optional<Devedor> buscarDevedor(Long id){
        return devedorRepository.findById(id);
    }

    public ResponseEntity<Void> deletarDevedor(Long id){
        if(!devedorRepository.existsById(id)){
            return ResponseEntity.notFound().build();
        }else{
            devedorRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
    }

    public ResponseEntity<Void> atualizarDevedor(Devedor devedorAtt, Long id){
        if(!devedorRepository.existsById(id)){
            return ResponseEntity.notFound().build();
        }else{
            Devedor devedor = devedorRepository.findById(id).get();
            devedor.setNome(devedorAtt.getNome());
            devedorRepository.save(devedor);
            return ResponseEntity.noContent().build();
        }
    }



}
