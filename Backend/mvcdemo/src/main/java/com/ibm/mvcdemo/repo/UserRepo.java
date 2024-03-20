package com.ibm.mvcdemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.mvcdemo.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
