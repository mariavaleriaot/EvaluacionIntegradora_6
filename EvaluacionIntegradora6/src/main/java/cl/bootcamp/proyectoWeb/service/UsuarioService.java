package cl.bootcamp.proyectoWeb.service;

import cl.bootcamp.proyectoWeb.entity.Usuario;

public interface UsuarioService {
    Usuario registrarUsuario(Usuario usuario);
    Usuario obtenerUsuarioPorId(int id);
}