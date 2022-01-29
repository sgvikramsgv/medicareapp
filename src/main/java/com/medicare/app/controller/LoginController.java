package com.medicare.app.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.medicare.app.global.GlobalData;
import com.medicare.app.model.Role;
import com.medicare.app.model.User;
import com.medicare.app.repository.RoleRepository;
import com.medicare.app.repository.UserRepository;

@Controller
public class LoginController {

	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	RoleRepository roleRepository;
	
	
	@GetMapping("/login")
	public String login() {
		
		GlobalData.cart.clear();
		return "login";
	}
	
	@GetMapping("/register")
	public String registerGet() {
		return "register";
	}
	
	@PostMapping("/register")
	public String registerPost(@ModelAttribute("user") User user, HttpServletRequest request) throws ServletException {
		
		String password = user.getPassword();
		user.setPassword(bCryptPasswordEncoder.encode(password));
		
		List<Role> roles = new ArrayList<>();
		user.setRoles(roles);
		userRepository.save(user);
		
		request.login(user.getEmail(), password);
		return "redirect:/";
		
	}
}
