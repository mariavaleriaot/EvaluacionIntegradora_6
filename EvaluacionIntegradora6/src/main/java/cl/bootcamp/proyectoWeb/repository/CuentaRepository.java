package cl.bootcamp.proyectoWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.bootcamp.proyectoWeb.entity.Cuenta;

public interface CuentaRepository extends JpaRepository<Cuenta, Integer> {

}
