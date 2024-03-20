package com.maven.mongo.MongoUser.repo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.maven.mongo.MongoUser.entity.User;


@Repository
public interface UserRepo extends MongoRepository<User, Integer> {

}
