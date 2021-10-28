package com.example.easylogin.model.dao;



import org.springframework.data.jpa.repository.JpaRepository;


import com.example.easylogin.model.entity.User;


public interface UserRepository extends JpaRepository<User, Long> {
	
}
