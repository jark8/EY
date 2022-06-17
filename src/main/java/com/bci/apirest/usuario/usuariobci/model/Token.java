package com.bci.apirest.usuario.usuariobci.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Token implements Serializable {
	private String user;
	private String pwd;
	private String token;
}
