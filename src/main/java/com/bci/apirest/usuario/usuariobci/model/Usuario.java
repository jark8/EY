package com.bci.apirest.usuario.usuariobci.model;

import java.util.Date;
import java.util.List;

public class Usuario {
	private String name, email, password, token;
	Long id;
	private Date creacion, modficacon, ultimooIngreso;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Date getCreacion() {
		return creacion;
	}

	public void setCreacion(Date creacion) {
		this.creacion = creacion;
	}

	public Date getModficacon() {
		return modficacon;
	}

	public void setModficacon(Date modficacon) {
		this.modficacon = modficacon;
	}

	public Date getUltimooIngreso() {
		return ultimooIngreso;
	}

	public void setUltimooIngreso(Date ultimooIngreso) {
		this.ultimooIngreso = ultimooIngreso;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	private List<Phones> phones;

	public List<Phones> getPhones() {
		return phones;
	}

	public void setPhones(List<Phones> phones) {
		this.phones = phones;
	}

	public Usuario(String name, String email, String password, List<Phones> phones) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.phones = phones;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
