package com.eduardomatsuda.minhasfinancas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardomatsuda.minhasfinancas.domain.Usuario;

public interface LancamentoRepository extends JpaRepository<Usuario, Integer>{

}
