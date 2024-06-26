package cl.bootcamp.proyectoWeb.exception;

public class SaldoInsuficienteException extends RuntimeException {
    private static final long serialVersionUID = 5948402369642130776L;

	public SaldoInsuficienteException(String message) {
        super(message);
    }
}