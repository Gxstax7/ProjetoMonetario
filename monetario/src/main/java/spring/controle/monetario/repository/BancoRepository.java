package spring.controle.monetario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.controle.monetario.model.Banco;

public interface BancoRepository extends JpaRepository <Banco, Long> {

}
