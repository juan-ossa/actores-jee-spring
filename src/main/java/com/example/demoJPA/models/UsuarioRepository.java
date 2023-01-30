/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demoJPA.models;

import com.example.demoJPA.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author josemeva
 */
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
