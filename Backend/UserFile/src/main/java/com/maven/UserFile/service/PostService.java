package com.maven.UserFile.service;


import java.util.List;

import com.maven.UserFile.entity.Post;


public interface PostService {
    List<Post> findAll();
    Post findById(int id);
	void save(Post post);
	void deleteById(int id);
}
