package com.github.gsc.globalsolution.model;


import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "peixes")
public class Peixe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50, unique = true)
    private String nome;

    @Column(nullable = false, length = 200, unique = true)
    private String descricao;

    @Column(nullable = false, columnDefinition = "NUMERIC(4,2)")
    private double pesoMaximo;

    @Column(nullable = false, columnDefinition = "DATE")
    private LocalDate dataCatalogacao;

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(double pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    public LocalDate getDataCatalogacao() {
        return dataCatalogacao;
    }

    public void setDataCatalogacao(LocalDate dataCatalogacao) {
        this.dataCatalogacao = dataCatalogacao;
    }
}
