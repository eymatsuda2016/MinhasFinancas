package com.eduardomatsuda.minhasfinancas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardomatsuda.minhasfinancas.domain.Lancamento;

public interface UsuarioRepository extends JpaRepository<Lancamento, Integer>{

}
