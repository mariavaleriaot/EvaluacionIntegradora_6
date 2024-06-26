package cl.bootcamp.proyectoWeb.service.serviceImpl;

import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.bootcamp.proyectoWeb.entity.Cuenta;
import cl.bootcamp.proyectoWeb.exception.SaldoInsuficienteException;
import cl.bootcamp.proyectoWeb.repository.CuentaRepository;
import cl.bootcamp.proyectoWeb.service.CuentaService;

@Service
public class CuentaServiceImpl implements CuentaService {

    @Autowired
    private CuentaRepository cuentaRepository;

    @Override
    public void actualizarSaldo(Cuenta cuenta, BigDecimal monto) {
        if (cuenta.getSaldo().compareTo(monto) < 0) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar la operación");
        }
        cuenta.setSaldo(cuenta.getSaldo().subtract(monto));
        cuentaRepository.save(cuenta);
    }
}