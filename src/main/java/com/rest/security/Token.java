package com.rest.security;

import java.io.Serializable;

public class Token implements Serializable {

	private static final long serialVersionUID = 4332633753963992655L;

	private String token;

	public Token() {
		super();
	}

	public Token(String token) {
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}
