package br.com.controle.investimentos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.controle.investimentos.dao.AtivoDAO;
import br.com.controle.investimentos.models.Ativo;

public class IAtivoService {
    @Autowired
    private AtivoDAO dao; 

    public List<Ativo> listarAtivo() {
        return (List<Ativo>) dao.findAll();
    }
}
