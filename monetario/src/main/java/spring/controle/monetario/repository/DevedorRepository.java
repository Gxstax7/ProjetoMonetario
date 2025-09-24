package spring.controle.monetario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.controle.monetario.model.Devedor;

public interface DevedorRepository extends JpaRepository <Devedor, Long>{

}
