package com.alex.poseidon.services;

import com.alex.poseidon.models.UserModel;
import com.alex.poseidon.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	private UserRepository userRep;

	@Autowired
	public UserService(UserRepository userRep) {

		this.userRep = userRep;
	}
	
	public UserModel getUserByEmail (String username) {

		return userRep.findByUsername(username);
	}
	
	public void saveUser(UserModel user) {

		userRep.save(user);
	}
	
    /**
     * Set an encoded password of the user password (non-encrypted)
     * 
     * @param user is the user logged-in
     * @return Encrypted password in the UserModel
     */
	public UserModel setUpUserModel(UserModel user) {
		user.setPassword(new Pbkdf2PasswordEncoder().encode(user.getPassword()));
		return user;
	}
}