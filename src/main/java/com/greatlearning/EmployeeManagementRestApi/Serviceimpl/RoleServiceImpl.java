package com.greatlearning.EmployeeManagementRestApi.Serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greatlearning.EmployeeManagementRestApi.entity.Roles;
import com.greatlearning.EmployeeManagementRestApi.repository.RoleRepository;
import com.greatlearning.EmployeeManagementRestApi.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	RoleRepository roleRepository;

	@Override
	@Transactional
	public List<Roles> findAll() {
		List<Roles> roles = roleRepository.findAll();
		return roles;
	}

	@Override
	@Transactional
	public Optional<Roles> findById(int theId) {
		return roleRepository.findById(theId);
	}

	@Override
	@Transactional
	public void save(Roles theRole) {
		roleRepository.save(theRole);
	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		roleRepository.deleteById(theId);
	}

	@Override
	public Optional<Roles> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}