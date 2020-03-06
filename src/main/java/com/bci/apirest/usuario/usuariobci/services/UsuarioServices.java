package com.bci.apirest.usuario.usuariobci.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bci.apirest.usuario.usuariobci.entity.UsuarioEntity;
import com.bci.apirest.usuario.usuariobci.model.Usuario;
import com.bci.apirest.usuario.usuariobci.repository.UsuarioRepository;

@Service

public class UsuarioServices {
	@Autowired
	UsuarioRepository usuarioRepository;

	public Usuario createOrUpdateUsuario(Usuario entity) {
		UsuarioEntity newEntity = new UsuarioEntity();
		newEntity.setEmail(entity.getEmail());
		newEntity.setName(entity.getName());
		newEntity = usuarioRepository.save(newEntity);
		entity.setId(newEntity.getId());
		return entity;
	}

}
