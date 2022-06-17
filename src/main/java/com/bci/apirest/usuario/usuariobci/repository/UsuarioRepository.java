package com.bci.apirest.usuario.usuariobci.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bci.apirest.usuario.usuariobci.entity.UsuarioEntity;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long>  {

	@Query( value =  "SELECT * FROM USUARIO a WHERE a.email = ?1", nativeQuery = true)
	UsuarioEntity findUsuarioByEmail(@Param("email") String email);

}
