package com.bci.apirest.usuario.usuariobci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.bci.apirest.usuario.usuariobci.security.JWTAuthorizationFilter;
@SpringBootApplication
public class UsuariobciApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsuariobciApplication.class, args);
	}

	@EnableWebSecurity
	@Configuration
	class WebSecurityConfig extends WebSecurityConfigurerAdapter {

		@Override
		protected void configure(HttpSecurity http) throws Exception {
			http.csrf().disable()
				.addFilterAfter(new JWTAuthorizationFilter(), UsernamePasswordAuthenticationFilter.class)
				.authorizeRequests()
				.antMatchers(HttpMethod.POST, "/token").permitAll()
				.antMatchers(HttpMethod.POST, "/h2/**").permitAll().antMatchers(HttpMethod.GET, "/h2/**")
	               .permitAll()
				.anyRequest().authenticated();
		}
	}
}
