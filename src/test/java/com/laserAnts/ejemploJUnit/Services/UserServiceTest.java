package com.laserAnts.ejemploJUnit.Services;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.*;
import org.mockito.*;
import org.mockito.junit.jupiter.*;

import com.laserAnts.ejemploJUnit.User;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
	
	@Mock
	UserRepository userRepository; //lo mismo seria void setup() {UserRepository userMock = Mockito.mock(UserRepository.class);}
	
	@InjectMocks
	UserService userService; // lo mismo seria en el setup() {UserService a = new UserService(UserMock)}
	
	@Test
	void createUserTest() {
		User userExpected = new User(1, "Felipe");
		Mockito.when(userRepository.creatUser(Mockito.anyInt(), Mockito.anyString())).thenReturn(userExpected);
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			userService.createUser(null, null);
		});
		final User userReturned = userService.createUser(1, "Felipe");
		Assertions.assertEquals(userExpected.getId(), userReturned.getId());
		
		Mockito.verify(userRepository, Mockito.times(1)).creatUser(Mockito.anyInt(), Mockito.anyString());
	}
	
	@Test
	void getUserTest() {
		User userExpected = new User(1, "Felipe");
		Mockito.when(userRepository.getUser(Mockito.anyInt())).thenReturn(userExpected);
		
		final User actualUser = userService.getUser(1);
		
		Assertions.assertNotNull(actualUser);
		Assertions.assertEquals(userExpected.getName(), actualUser.getName());
		
		Mockito.verify(userRepository, Mockito.times(1)).getUser(Mockito.anyInt());
	}

}
