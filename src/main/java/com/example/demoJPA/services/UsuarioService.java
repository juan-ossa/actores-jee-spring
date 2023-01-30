/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demoJPA.services;

import com.example.demoJPA.entities.Usuario;
import com.example.demoJPA.models.UsuarioRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author josemeva
 */
//@Component
@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> getUsuarios() {
        return usuarioRepository.findAll();

    }

    public Optional<Usuario> getUsuario(Integer id) {
        return usuarioRepository.findById(id);

    }

    public void addUsuario(Usuario a) {
        System.out.println(a);
        usuarioRepository.save(a);

    }

    public void deleteUsuario(Integer id) {

        boolean exist = usuarioRepository.existsById(id);
        if (!exist) {
            throw new IllegalStateException("Usuario id " + id + " No existe");
        } else {
            usuarioRepository.deleteById(id);
        }
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Transactional
    public void updateUsuario(Integer id, String name) {

        Usuario a = usuarioRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException("Usuario id " + id + " No existe"));

        a.setFirstName(name);
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
