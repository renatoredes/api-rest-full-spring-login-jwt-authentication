package com.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rest.validators.TokenValidator;

/**
 * @author Renato Melo
 *
 */
@Service
public class AuthorizationServiceImpl implements AuthorizationService {

	@Autowired
	TokenValidator tokenValidator;
	
	@Override
	public void authorize(String token) throws Exception {
		tokenValidator.validate(token);
	}

}
