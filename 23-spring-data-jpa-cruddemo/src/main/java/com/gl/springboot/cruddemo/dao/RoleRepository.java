package com.gl.springboot.cruddemo.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.springboot.cruddemo.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
	

}