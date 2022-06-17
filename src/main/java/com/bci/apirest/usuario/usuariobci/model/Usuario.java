package com.bci.apirest.usuario.usuariobci.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class Usuario implements Serializable {
  private String name, email, password, token;
  Long id;
  private Date creacion, modficacon, ultimooIngreso;
  private List<Phones> phones;
}

