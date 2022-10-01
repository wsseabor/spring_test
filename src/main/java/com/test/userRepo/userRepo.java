package com.test.userRepo;


import org.springframework.data.jpa.repository.JpaRepository;
import com.test.entity.user;

public interface userRepo extends JpaRepository<user, Long>{
    
}
