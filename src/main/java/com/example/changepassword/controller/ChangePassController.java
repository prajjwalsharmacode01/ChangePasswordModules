package com.example.changepassword.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.changepassword.service.UserSerivice;

@RestController
@RequestMapping("/user")
public class ChangePassController {
	@Autowired
	private UserSerivice uss;

	@PostMapping("/updatepass/{id}")
	public String updatePassword(@RequestBody UserModel us, @PathVariable Long id) {
		try {
			System.out.print(id);
			uss.updatePass(us, id);
			return "Sucess";
		} catch (Exception e)

		{
			e.printStackTrace();

		}
		return "Failure";
	}

}
