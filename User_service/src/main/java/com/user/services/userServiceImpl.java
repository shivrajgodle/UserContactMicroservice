package com.user.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;


@Service
public class userServiceImpl implements UserService {

	//fake user list
	
	List<User> list = List.of(
			
			new User(1322L,"shivraj","9689456585"),
			new User(1323L,"Ganesh","9689453434"),
			new User(1324L, "manisha","9889456585")
			
			);
			
	
	
	@Override
	public User getUser(Long id) {
		// TODO Auto-generated method stub
		return list.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null);
	}

}
