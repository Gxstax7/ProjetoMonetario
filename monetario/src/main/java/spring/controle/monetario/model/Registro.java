package spring.controle.monetario.model;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Registro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private double valor;
    private String descricao;
    private String categoria;
    private boolean status;
    private LocalDateTime data;

    @OneToOne (cascade = CascadeType.ALL)
    private Devedor devedor;
    @OneToOne (cascade = CascadeType.ALL)
    private Banco banco;

    // Construtor
    public Registro(final Long id, final double  valor, final String descricao, final String categoria, final boolean status, final LocalDateTime data, final Devedor devedor, final Banco banco){
        this.id = id;
        this.categoria = categoria;
        this.valor = valor;
        this.descricao = descricao;
        this.status = status;
        this.data = data;
        this.devedor = devedor;
        this.banco = banco;
    }

    public Registro(){
        this.id = null;
        this.categoria = "";
        this.valor = 0;
        this.descricao ="";
        this.status = false;
        this.devedor = null;
        this.banco = null;
        this.data = LocalDateTime.now();
    }

    // Getters
    public double getValor() {
        return valor;
    }

    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public boolean isStatus() {
        return status;
    }

    public LocalDateTime getData() {
        return data;
    }

    // Setters
    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    
    public Banco getBanco() {
        return banco;
    }
    
    public void setBanco(Banco banco) {
        this.banco = banco;
    }
    
    public Devedor getDevedor() {
        return devedor;
    }

    public void setDevedor(Devedor devedor) {
        this.devedor = devedor;
    }
        

}
