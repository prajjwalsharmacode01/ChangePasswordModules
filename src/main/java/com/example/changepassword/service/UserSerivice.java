package com.example.changepassword.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.changepassword.controller.UserModel;
import com.example.changepassword.dao.UserRepository;
import com.example.changepassword.enties.UserEntity;

@Service
public class UserSerivice {
	@Autowired
	private UserRepository usrepo;

	public void updatePass(UserModel us, Long id) {
		// TODO Auto-generated method stub
		Optional<UserEntity> userEntity = usrepo.findById(id);
		if (userEntity.isPresent()) {
			userEntity.get().setPassword(us.getPassword());
			usrepo.save(userEntity.get());
		}

	}

}
