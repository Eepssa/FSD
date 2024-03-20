package com.maven.UserFile.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maven.UserFile.entity.User;


@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
