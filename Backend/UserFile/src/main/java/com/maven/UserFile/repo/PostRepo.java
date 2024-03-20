package com.maven.UserFile.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maven.UserFile.entity.Post;


@Repository
public interface PostRepo extends JpaRepository<Post, Integer> {

}
