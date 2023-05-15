package com.greatlearning.EmployeeManagementRestApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.EmployeeManagementRestApi.entity.Roles;

public interface RoleRepository extends JpaRepository<Roles, Integer> {

}
