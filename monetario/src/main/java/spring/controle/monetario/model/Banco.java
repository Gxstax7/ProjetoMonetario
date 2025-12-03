package spring.controle.monetario.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
public class Banco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;
    private int dataFechamento;

    // Construtor
    public Banco(final Long id, final String nome, final int dataFechamento){
        this.id = id;
        this.nome = nome;
        this.dataFechamento = dataFechamento;
    }

    public Banco(){
        nome = "";
    }

    // Getters
    public int getDataFechamento() {
        return dataFechamento;
    }

    public String getNome() {
        return nome;
    }

    public Long getId() {
        return id;
    }

    // Setters
    public void setDataFechamento(int dataFechamento) {
        this.dataFechamento = dataFechamento;
    }  

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
