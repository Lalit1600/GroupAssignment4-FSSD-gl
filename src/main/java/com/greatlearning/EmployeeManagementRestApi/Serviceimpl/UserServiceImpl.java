package com.greatlearning.EmployeeManagementRestApi.Serviceimpl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greatlearning.EmployeeManagementRestApi.entity.User;
import com.greatlearning.EmployeeManagementRestApi.repository.UserRepository;
import com.greatlearning.EmployeeManagementRestApi.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	@Transactional
	public List<User> findAll() {
		List<User> users = userRepository.findAll();
		return users;
	}

	@Override
	@Transactional
	public Optional<User> findById(long theId) {
		return userRepository.findById(theId);
	}

	@Override
	@Transactional
	public void save(User theUser) {
		userRepository.save(theUser);
	}

	@Override
	@Transactional
	public void deleteById(long theId) {
		userRepository.deleteById(theId);
	}

	@Override
	@Transactional
	public Optional<User> findByUserName(String userName) {
		return Optional.ofNullable(userRepository.getUserByUsername(userName));
	}

}