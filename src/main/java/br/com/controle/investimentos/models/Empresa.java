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
@Table(name = "empresa")
public abstract class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empresa")
    private Integer idEmpresa;

    @Column(name = "nome", length = 100)
    private String nome;

    @Column(name = "setor", length = 100)
    private String setor;

    @OneToMany(mappedBy = "empresa")
    @JsonIgnoreProperties("empresa")
    private List<Ativo> listaAtivos;

    public Empresa(String nome, String setor, List<Ativo> listaAtivos) {
        this.nome = nome;
        this.setor = setor;
        this.listaAtivos = listaAtivos;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public List<Ativo> getListaAtivos() {
        return listaAtivos;
    }

    public void setListaAtivos(List<Ativo> listaAtivos) {
        this.listaAtivos = listaAtivos;
    }
}
