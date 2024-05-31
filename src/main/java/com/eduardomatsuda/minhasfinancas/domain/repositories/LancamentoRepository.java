package com.eduardomatsuda.minhasfinancas.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardomatsuda.minhasfinancas.domain.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{

}
