package br.paduan.empresa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.paduan.empresa.model.Produto;
import br.paduan.empresa.services.IProdutoService;

@RestController
@CrossOrigin("*")
public class ProdutoController {

    @Autowired
    private IProdutoService servico;

    @GetMapping("/produto/{cod}")
    public ResponseEntity<Produto> buscarProdutoPorCodigo(@PathVariable int cod) {

        // pede para o service buscar o produto no BD
        Produto produto = servico.buscarProdutoPorCod(cod);

        if (produto != null) { // encontrou o produto no BD
            return ResponseEntity.ok(produto); // responde OK para o Front com o procuto encontrado
        } else {
            return ResponseEntity.notFound().build(); // responde para o Front que não achou o produto
        }
    }
}