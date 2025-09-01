package spring.controle.monetario.service;

import org.springframework.stereotype.Service;

import spring.controle.monetario.repository.RegistroRepository;

@Service
public class RegistroService {

    private final RegistroRepository registroRepository;

    public RegistroService(RegistroRepository registroRepository) {
        this.registroRepository = registroRepository;
    }

}
