package br.paduan.empresa.dao;

import org.springframework.data.repository.CrudRepository;

import br.paduan.empresa.model.Produto;

public interface ProdutoDAO extends CrudRepository<Produto, Integer>{
    
}