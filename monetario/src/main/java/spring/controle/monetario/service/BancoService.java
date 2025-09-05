package spring.controle.monetario.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import spring.controle.monetario.model.Banco;
import spring.controle.monetario.repository.BancoRepository;

@Service
public class BancoService {

    private BancoRepository bancoRepository;

    public BancoService(BancoRepository bancoRepository) {
        this.bancoRepository = bancoRepository;
    }

    public List <Banco> mostrarBancos(){
        return bancoRepository.findAll();
    }

    public Banco criarBanco(Banco banco){
        return bancoRepository.save(banco);
    }

    public Optional<Banco> buscarBanco(Long id){
        return bancoRepository.findById(id);
    }

    public ResponseEntity<Void> deletarBanco(Long id){
        if(!bancoRepository.existsById(id)){
            return ResponseEntity.notFound().build();
        }else{
            bancoRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
    }

    //TODO: Criar endpoit de update

}
