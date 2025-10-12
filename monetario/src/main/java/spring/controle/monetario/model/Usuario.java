package spring.controle.monetario.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    public Usuario (){
        this.id = null;
        this.nome = "";
    }

    public Usuario (String nome){
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
