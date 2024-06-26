package cl.bootcamp.proyectoWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.bootcamp.proyectoWeb.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
