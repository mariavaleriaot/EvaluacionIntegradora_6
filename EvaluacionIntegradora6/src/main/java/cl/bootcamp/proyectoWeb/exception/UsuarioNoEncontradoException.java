package cl.bootcamp.proyectoWeb.exception;

public class UsuarioNoEncontradoException extends RuntimeException {
    private static final long serialVersionUID = -78988216750236611L;

	public UsuarioNoEncontradoException(String message) {
        super(message);
    }
}