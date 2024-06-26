package cl.bootcamp.proyectoWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.bootcamp.proyectoWeb.entity.Transaccion;

public interface TransaccionRepository extends JpaRepository<Transaccion, Integer>{

}
