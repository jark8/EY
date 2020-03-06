package com.bci.apirest.usuario.usuariobci.controller;

import javax.ws.rs.HeaderParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bci.apirest.usuario.usuariobci.model.Usuario;
import com.bci.apirest.usuario.usuariobci.services.UsuarioServices;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/crearusuario")
@CrossOrigin
public class UsuarioBciController {

	@Autowired
	UsuarioServices usuarioServices;

	@PostMapping
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 401, message = "Invalid JWT Token"),
			@ApiResponse(code = 404, message = "Account not Found"), @ApiResponse(code = 200, message = "Success") })

	public ResponseEntity<Usuario> loguinUsuario(@RequestBody Usuario usuario,
			 @RequestHeader("Authorization") String tk) {
		usuario.setToken(tk);

		usuarioServices.createOrUpdateUsuario(usuario);
		return new ResponseEntity<Usuario>(usuario, new HttpHeaders(), HttpStatus.OK);
	}

}
