package com.rest.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Renato Melo
 *
 */

@RestController
@RequestMapping(value = "/")
public class HomeRestController {

	@GetMapping
	private ResponseEntity<Object> home() {
		//return ResponseEntity.ok().body("Api Rest Full Spring boot com autenticação de Login. Mais detalhes acesse: <a target='_blank' href='https://github.com/renatoredes/api-rest-full-spring-login-jwt-authentication<a>");
		return ResponseEntity.ok().body("Api Rest Full Spring boot com autenticação de Login. Mais detalhes acesse:: <a target='_blank' href='https://github.com/renatoredes/api-rest-full-spring-login-jwt-authentication'>https://github.com/renatoredes/api-rest-full-spring-login-jwt-authentication<a>");

	}

}
