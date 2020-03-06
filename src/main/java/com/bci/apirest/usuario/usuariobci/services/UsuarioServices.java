package com.bci.apirest.usuario.usuariobci.services;

import java.sql.Date;

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
        long millis=System.currentTimeMillis();  

		newEntity.setEmail(entity.getEmail());
		newEntity.setName(entity.getName());
		newEntity.setCreated(new Date(millis));
		newEntity.setModified(new Date(millis));
		newEntity.setLastLogin(new Date(millis));
		newEntity.setToken(entity.getToken());
		newEntity = usuarioRepository.save(newEntity);
		entity.setId(newEntity.getId());
		entity.setCreacion(new Date(millis));
		entity.setModficacon(new Date(millis));
		entity.setUltimooIngreso(new Date(millis));
		
		return entity;
	}

}
