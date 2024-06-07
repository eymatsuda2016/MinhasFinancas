package com.eduardomatsuda.minhasfinancas.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.eduardomatsuda.minhasfinancas.domain.Usuario;
import com.eduardomatsuda.minhasfinancas.domain.repositories.UsuarioRepository;
import com.eduardomatsuda.minhasfinancas.exception.RegraNegocioException;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@ActiveProfiles("test")
public class UsuarioServiceTest {

	@Autowired
    UsuarioService service;
	
	@Autowired
	UsuarioRepository repository;
	
	@Test
	public void deveValidarEmail() {
		repository.deleteAll();
		
		service.validarEmail("email@email.com");
	}
	
	@Test()
	public void deveLancarErroAoValidarEmailQuandoExistirEmailCadastrado() {
		
		Assertions.assertThat(RegraNegocioException.class, () -> {
		Usuario usuario = Usuario.builder().nome("usuario").email("email@email.com").build();
		
		repository.save(usuario);
		
		service.validarEmail("email@email.com");
	});
	}
	
}
