package spring.controle.monetario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.controle.monetario.model.Usuario;

public interface UsuarioRepository extends JpaRepository <Usuario, Long>{

}
