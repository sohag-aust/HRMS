package com.cramstack.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cramstack.Entities.User;

@Repository
public interface UserDao extends CrudRepository<User, Integer>, JpaRepository<User, Integer>{

	
}
