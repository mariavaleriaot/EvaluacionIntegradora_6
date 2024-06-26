package cl.bootcamp.proyectoWeb.service;

import java.math.BigDecimal;
import cl.bootcamp.proyectoWeb.entity.Cuenta;

public interface CuentaService {
    void actualizarSaldo(Cuenta cuenta, BigDecimal monto);
}