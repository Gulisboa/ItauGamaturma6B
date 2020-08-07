package br.paduan.loja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.paduan.loja.dao.UsuarioDAO;
import br.paduan.loja.model.Usuario;

@RestController
@CrossOrigin("*")
public class UsuarioController {
    
    @Autowired
    private UsuarioDAO dao;

    @GetMapping("/usuario/{id}")
    public ResponseEntity<Usuario> buscarPorId(@PathVariable int id){
        Usuario usuario = dao.findById(id).orElse(null);

        if(usuario != null){
            return ResponseEntity.ok(usuario);
        }else{
            return ResponseEntity.notFound().build();
        }
    }
}