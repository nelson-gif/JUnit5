package com.laserAnts.ejemploJUnit.Services;

import com.laserAnts.ejemploJUnit.User;

public class UserService {
	
	private final UserRepository userRepository;
	
	public UserService(final UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public User createUser(final Integer id, final String name) {
		if(id ==null || name.equals(null)) {
			throw new IllegalArgumentException("No se pueden enviar valores nulos");
		}
		return userRepository.creatUser(id, name);
	}

	public User getUser(final Integer id) {
		return userRepository.getUser(id);
	}
}
