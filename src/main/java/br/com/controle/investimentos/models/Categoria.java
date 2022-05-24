package br.com.controle.investimentos.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Integer idCategoria;

    @Column(name = "tipo_investimento", length = 50)
    private String tipoInvestimento;

    @OneToMany(mappedBy = "categoria")
    @JsonIgnoreProperties("categoria")
    private List<Ativo> listaAtivos;

    public Categoria(String tipoInvestimento, List<Ativo> listaAtivos) {
        this.tipoInvestimento = tipoInvestimento;
        this.listaAtivos = listaAtivos;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public String getTipoInvestimento() {
        return tipoInvestimento;
    }

    public void setTipoInvestimento(String tipoInvestimento) {
        this.tipoInvestimento = tipoInvestimento;
    }

    public List<Ativo> getListaAtivos() {
        return listaAtivos;
    }

    public void setListaAtivos(List<Ativo> listaAtivos) {
        this.listaAtivos = listaAtivos;
    }
}
