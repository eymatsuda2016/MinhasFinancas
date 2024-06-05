package com.eduardomatsuda.minhasfinancas.domain.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardomatsuda.minhasfinancas.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	//Optional<Usuario> findByEmail(String email);
	
	boolean existsByEmail(String emsil);

}
