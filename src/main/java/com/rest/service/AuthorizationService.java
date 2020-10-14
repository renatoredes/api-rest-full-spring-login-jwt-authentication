package com.rest.service;

/**
 * @author Renato Melo
 *
 */
public interface AuthorizationService {
	
	public void authorize(String token) throws Exception;

}
