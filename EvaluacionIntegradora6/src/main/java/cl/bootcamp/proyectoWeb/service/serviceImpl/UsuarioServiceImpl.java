package cl.bootcamp.proyectoWeb.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import cl.bootcamp.proyectoWeb.entity.Rol;
import cl.bootcamp.proyectoWeb.entity.Usuario;
import cl.bootcamp.proyectoWeb.exception.UsuarioNoEncontradoException;
import cl.bootcamp.proyectoWeb.repository.UsuarioRepository;
import cl.bootcamp.proyectoWeb.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public Usuario registrarUsuario(Usuario usuario) {
        usuario.setContrasena(passwordEncoder.encode(usuario.getContrasena()));
        usuario.setRol(Rol.USER); // Asignar rol por defecto
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario obtenerUsuarioPorId(int id) {
        return usuarioRepository.findById(id).orElseThrow(() -> new UsuarioNoEncontradoException("Usuario no encontrado con id: " + id));
    }
}