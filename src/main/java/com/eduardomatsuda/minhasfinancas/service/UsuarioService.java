package com.eduardomatsuda.minhasfinancas.service;

import com.eduardomatsuda.minhasfinancas.domain.Usuario;



public interface UsuarioService {
	
	Usuario autenticar(String email, String Senha);
	
	Usuario salvarUsuario (Usuario usuario);
	
	void validarEmail(String email);

}
