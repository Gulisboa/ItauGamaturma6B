package br.paduan.empresa.services;

import br.paduan.empresa.model.Produto;

public interface IProdutoService {
    public Produto buscarProdutoPorCod(int cod);
}