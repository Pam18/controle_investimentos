package br.com.controle.investimentos.dto;

import br.com.controle.investimentos.models.Categoria;

public class AtivoDTO {
    private String sigla;
    private Integer quantidade;
    private Double cotacaoCompra;
    private Double dividendYieldTrimestral;
    private Categoria categoria;

    public AtivoDTO(String sigla, Integer quantidade, Double cotacaoCompra, Double dividendYieldTrimestral,
            Categoria categoria) {
        this.sigla = sigla;
        this.quantidade = quantidade;
        this.cotacaoCompra = cotacaoCompra;
        this.dividendYieldTrimestral = dividendYieldTrimestral;
        this.categoria = categoria;
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
    public Double getCotacaoCompra() {
        return cotacaoCompra;
    }
    public void setCotacaoCompra(Double cotacaoCompra) {
        this.cotacaoCompra = cotacaoCompra;
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
}
