package spring.controle.monetario.model;

import java.time.LocalDate;

@Entity
public class Registro {

    private Long id;
    private double valor;
    private String descricao;
    private String categoria;
    private boolean status;
    private LocalDate data;

    // Construtor
    public Registro(final Long id, final double  valor, final String descricao, final String categoria, final boolean status, final LocalDate data){
        this.id = id;
        this.categoria = categoria;
        this.valor = valor;
        this.descricao = descricao;
        this.status = status;
        this.data = data;
    }

    public Registro(){
        this.id = null;
        this.categoria = "";
        this.valor = 0;
        this.descricao ="";
        this.status = false;
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

    public LocalDate getData() {
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

    public void setData(LocalDate data) {
        this.data = data;
    }
}
