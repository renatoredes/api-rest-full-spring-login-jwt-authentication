package com.rest.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import javax.validation.Validator;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.model.User;
import com.rest.security.Credentials;
import com.rest.security.Token;
import com.rest.service.AuthenticationService;
import com.rest.service.UserService;

/**
 * 
 * @author Renato Melo
 *
 */

@RestController
@RequestMapping(value = "/")
public class AuthenticationRestController {

	@Autowired
	UserService userService;

	@Autowired
	AuthenticationService authenticationService;

	@Autowired
	Validator validator;

	@PostMapping("/signup")
	private ResponseEntity<Object> signup(@RequestBody User user) throws Exception {

		userService.save(user);

		Token token = authenticationService.generateToken(user);

		return ResponseEntity.ok().body(token);
	}

	@PostMapping("/signin")
	private ResponseEntity<Object> signin(@RequestBody Credentials credentials) throws Exception {

		Token token = authenticationService.authenticate(credentials);

		return ResponseEntity.ok().body(token);
	}

}
