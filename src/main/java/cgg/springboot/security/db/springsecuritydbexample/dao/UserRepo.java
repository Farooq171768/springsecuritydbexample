package cgg.springboot.security.db.springsecuritydbexample.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cgg.springboot.security.db.springsecuritydbexample.entities.User1;


public interface UserRepo extends JpaRepository<User1, Integer>{
    User1 findByUserName(String userName);
}
