package com.cramstack.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.cramstack.Entities.User;

public interface UserDao extends CrudRepository<User, Integer>, JpaRepository<User, Integer>{

	
}
