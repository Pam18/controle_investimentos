package br.com.controle.investimentos.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "ativo")
public class Ativo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ativo")
    private Integer idAtivo;

    @Column(name = "sigla", length = 50, unique = true)
    private String sigla;

    @Column(name = "quantidade")
    private Integer quantidade;

    @Column(name = "data_compra")
    private Date dataCompra;

    @Column(name = "cotacao_compra")
    private Double cotacaoCompra;

    @Column(name = "data_venda", nullable = true)
    private Date dataVenda;

    @Column(name = "cotacao_venda", nullable = true)
    private Double cotacaoVenda;

    @Column(name = "cotacao_trimestral", nullable = true)
    private Double cotacaoTrimestral;

    @Column(name = "dividend_yield_inicial")
    private Double dividendYieldInicial;

    @Column(name = "dividend_yield_trimestral", nullable = true)
    private Double dividendYieldTrimestral;

    @ManyToOne
    @JoinColumn(name = "categoria")
    @JsonIgnoreProperties("listaAtivos")
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "empresa")
    @JsonIgnoreProperties("listaAtivos")
    private Empresa empresa;

    public Ativo(String sigla, Integer quantidade, Date dataCompra, Double cotacaoCompra,
            Date dataVenda, Double cotacaoVenda, Double cotacaoTrimestral, Double dividendYieldInicial,
            Double dividendYieldTrimestral, Categoria categoria, Empresa empresa) {
        this.sigla = sigla;
        this.quantidade = quantidade;
        this.dataCompra = dataCompra;
        this.cotacaoCompra = cotacaoCompra;
        this.dataVenda = dataVenda;
        this.cotacaoVenda = cotacaoVenda;
        this.cotacaoTrimestral = cotacaoTrimestral;
        this.dividendYieldInicial = dividendYieldInicial;
        this.dividendYieldTrimestral = dividendYieldTrimestral;
        this.categoria = categoria;
        this.empresa = empresa;
    }

    public Integer getIdAtivo() {
        return idAtivo;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public Double getCotacaoCompra() {
        return cotacaoCompra;
    }

    public void setCotacaoCompra(Double cotacaoCompra) {
        this.cotacaoCompra = cotacaoCompra;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Double getCotacaoVenda() {
        return cotacaoVenda;
    }

    public void setCotacaoVenda(Double cotacaoVenda) {
        this.cotacaoVenda = cotacaoVenda;
    }

    public Double getCotacaoTrimestral() {
        return cotacaoTrimestral;
    }

    public void setCotacaoTrimestral(Double cotacaoTrimestral) {
        this.cotacaoTrimestral = cotacaoTrimestral;
    }

    public Double getDividendYieldInicial() {
        return dividendYieldInicial;
    }

    public void setDividendYieldInicial(Double dividendYieldInicial) {
        this.dividendYieldInicial = dividendYieldInicial;
    }

    public Double getDividendYieldTrimestral() {
        return dividendYieldTrimestral;
    }

    public void setDividendYieldTrimestral(Double dividendYieldTrimestral) {
        this.dividendYieldTrimestral = dividendYieldTrimestral;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    
}
