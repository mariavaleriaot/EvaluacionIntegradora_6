package cl.bootcamp.proyectoWeb.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.bootcamp.proyectoWeb.entity.Cuenta;
import cl.bootcamp.proyectoWeb.service.CuentaService;

@RestController
@RequestMapping("/api/cuentas")
public class CuentaController {

    @Autowired
    private CuentaService cuentaService;

    @PutMapping("/actualizarSaldo")
    public void actualizarSaldo(@RequestBody Cuenta cuenta, @RequestParam BigDecimal monto) {
        cuentaService.actualizarSaldo(cuenta, monto);
    }
}