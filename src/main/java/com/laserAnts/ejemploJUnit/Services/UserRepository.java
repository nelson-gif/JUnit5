package com.laserAnts.ejemploJUnit.Services;

import com.laserAnts.ejemploJUnit.User;

public interface UserRepository {
	
	public User creatUser(Integer id, String name);
	
	public User getUser(Integer id);

}
