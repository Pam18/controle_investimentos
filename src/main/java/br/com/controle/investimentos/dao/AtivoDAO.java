package br.com.controle.investimentos.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.controle.investimentos.models.Ativo;

public interface AtivoDAO extends CrudRepository<Ativo, Integer> {

    // public List<Ativo> listarAtivos();
}
