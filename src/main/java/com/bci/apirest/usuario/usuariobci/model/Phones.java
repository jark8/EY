package com.bci.apirest.usuario.usuariobci.model;


import lombok.Data;

import java.io.Serializable;

@Data
public class Phones implements Serializable {
private String number, citycode,contrycode;
}
