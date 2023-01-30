/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demoJPA.controllers;

import com.example.demoJPA.entities.Usuario;
import com.example.demoJPA.services.UsuarioService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author josemeva
 */
@RestController
@RequestMapping(path = "/api")
@CrossOrigin(origins = "http://localhost:4200")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping(path = "/usuario")
    List<Usuario> getUsuarios() {

        return usuarioService.getUsuarios();
    }

    @GetMapping(path = "/usuario/{id}")
    Optional<Usuario> getUsuario(@PathVariable("id") Integer id) {

        return usuarioService.getUsuario(id);
    }

    @PostMapping(path = "/usuario")
    void addUsuario(@RequestBody Usuario usuario) {

        usuarioService.addUsuario(usuario);
    }

    @DeleteMapping(path = "/usuario/{id}")
    void deleteUsuario(@PathVariable("id") Integer id) {

        usuarioService.deleteUsuario(id);
    }

    @PutMapping(path = "/usuario/{id}")
    void updateUsuario(@PathVariable("id") Integer id,
            @RequestParam(required = false) String name
    ) {

        usuarioService.updateUsuario(id, name);
    }
}
