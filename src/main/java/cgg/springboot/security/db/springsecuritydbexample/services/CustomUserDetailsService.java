package cgg.springboot.security.db.springsecuritydbexample.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import cgg.springboot.security.db.springsecuritydbexample.dao.UserRepo;
import cgg.springboot.security.db.springsecuritydbexample.entities.CustomUserDetails;
import cgg.springboot.security.db.springsecuritydbexample.entities.User1;

@Service
public class CustomUserDetailsService implements UserDetailsService{


    @Autowired
    private UserRepo userRepo;
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       User1 user=userRepo.findByUserName(username);
       if(user==null){
        throw new UsernameNotFoundException("No user");
       }
       return new CustomUserDetails(user);
    }
    
}
