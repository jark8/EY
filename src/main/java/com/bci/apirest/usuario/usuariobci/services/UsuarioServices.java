package com.bci.apirest.usuario.usuariobci.services;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bci.apirest.usuario.usuariobci.entity.UsuarioEntity;
import com.bci.apirest.usuario.usuariobci.model.Usuario;
import com.bci.apirest.usuario.usuariobci.repository.UsuarioRepository;

@Service
public class UsuarioServices {
	
	private final UsuarioRepository usuarioRepository;
	
	@Autowired
	public UsuarioServices(final UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}

	public Usuario createOrUpdateUsuario(Usuario usuarioDt) throws Exception {
		UsuarioEntity newEntity = new UsuarioEntity();
		long millis = System.currentTimeMillis();
		newEntity.setEmail(usuarioDt.getEmail());
		newEntity.setName(usuarioDt.getName());
		newEntity.setCreated(new Date(millis));
		newEntity.setModified(new Date(millis));
		newEntity.setLastLogin(new Date(millis));
		newEntity.setToken(usuarioDt.getToken());
		UsuarioEntity usuarioEntity = usuarioRepository.findUsuarioByEmail(usuarioDt.getEmail());
		if (null == usuarioEntity) {
			newEntity = usuarioRepository.save(newEntity);
		}else {
			  throw new Exception ("El susuario ya esta registrado");
		}
		usuarioDt.setId(newEntity.getId());
		usuarioDt.setCreacion(new Date(millis));
		usuarioDt.setModficacon(new Date(millis));
		usuarioDt.setUltimooIngreso(new Date(millis));
		return usuarioDt;
	}

}
