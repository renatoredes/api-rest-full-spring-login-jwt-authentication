package com.rest.security;

import java.io.Serializable;
import com.sun.istack.NotNull;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Email;

/**
 * 
 * @author Renato Melo
 *
 */
public class Credentials implements Serializable {

	private static final long serialVersionUID = 8101496378501812185L;

	@NotNull
	@NotBlank
	@Email
	private String email;

	@NotNull
	@NotBlank
	private String password;

	public Credentials(String email, String password) {
		this.email = email;
		this.password = password;
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
