package com.eduardomatsuda.minhasfinancas.service.impl;

import org.springframework.stereotype.Service;

import com.eduardomatsuda.minhasfinancas.domain.Usuario;
import com.eduardomatsuda.minhasfinancas.domain.repositories.UsuarioRepository;
import com.eduardomatsuda.minhasfinancas.exception.RegraNegocioException;
import com.eduardomatsuda.minhasfinancas.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	private UsuarioRepository repository;
	
	public UsuarioServiceImpl(UsuarioRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Usuario autenticar(String email, String Senha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario salvarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void validarEmail(String email) {
		
		boolean existe = repository.existsByEmail(email);
		if(existe) {
			throw new RegraNegocioException("Já existe um usuario cadastrado com este e-mail");
		}
	}
	
}
