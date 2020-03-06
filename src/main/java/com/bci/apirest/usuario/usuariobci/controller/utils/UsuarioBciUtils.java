package com.bci.apirest.usuario.usuariobci.controller.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsuarioBciUtils {

	public static final boolean validarMail(String email) {
		String emailPattern = "^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,4})$";
		Pattern pattern = Pattern.compile(emailPattern);
		Matcher matcher = pattern.matcher(email);
		if (matcher.matches()) {
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}

	public static final boolean validarPassword(String passwrd) {
		String passwordPattern = "^(?=\\w*\\d{2})(?=\\w*[A-Z])(?=\\w*[a-z])\\S{8,16}$";
		Pattern pattern = Pattern.compile(passwordPattern);
		Matcher matcher = pattern.matcher(passwrd);
		if (matcher.matches()) {
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}
}
