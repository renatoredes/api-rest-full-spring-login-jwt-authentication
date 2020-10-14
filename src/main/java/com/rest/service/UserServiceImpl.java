package com.rest.service;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.model.User;
import com.rest.repository.UserRepository;
import com.rest.validators.UserValidator;

/**
 * @author Renato Melo
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	UserValidator userValidator;
	
	@Override
	public User save(User user) throws Exception {
		
		userValidator.validate(user);
		
		this.encryptPassword(user);
		
		return userRepository.save(user);
	}

	private void encryptPassword(User user) {
		String encryptedPassword = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt(12));
		user.setPassword(encryptedPassword);
	}

}
