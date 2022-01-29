package com.medicare.app.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.medicare.app.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
