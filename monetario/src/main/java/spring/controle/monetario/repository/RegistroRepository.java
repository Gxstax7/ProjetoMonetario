package spring.controle.monetario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.controle.monetario.model.Registro;

public interface RegistroRepository extends JpaRepository <Registro, Long> {

}
