package spring.controle.monetario.model;

import java.time.LocalDate;

@Entity
public class Banco {

    private Long id;
    private String nome;
    private LocalDate dataFechamento;

    // Construtor
    public Banco(final Long id, final String nome, final LocalDate dataFechamento){
        this.id = id;
        this.nome = nome;
        this.dataFechamento = dataFechamento;
    }

    public Banco(){
        nome = "";
    }

    // Getters
    public LocalDate getDataFechamento() {
        return dataFechamento;
    }

    public String getNome() {
        return nome;
    }

    public Long getId() {
        return id;
    }

    // Setters
    public void setDataFechamento(LocalDate dataFechamento) {
        this.dataFechamento = dataFechamento;
    }  

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
