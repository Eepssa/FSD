package com.maven.UserFile.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maven.UserFile.entity.Post;
import com.maven.UserFile.repo.PostRepo;


@Service
public class PostServiceImpl implements PostService {
	@Autowired
	PostRepo postRepo;
	
	
	@Override
	public List<Post> findAll() {
		// TODO Auto-generated method stub
		return postRepo.findAll();
	}

	@Override
	public Post findById(int id) {
		 
		return postRepo.findById(id).get();
	}

	@Override
	public void save(Post post) {
		postRepo.save(post);
		
	}

	@Override
	public void deleteById(int id) {
		postRepo.deleteById(id);
		
	}

}
