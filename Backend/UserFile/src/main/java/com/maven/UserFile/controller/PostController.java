package com.maven.UserFile.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.maven.UserFile.entity.Post;
import com.maven.UserFile.service.PostService;



@RestController
@CrossOrigin("*")
public class PostController {
	@Autowired
	PostService postService;
	
	@GetMapping("/post")
	List<Post> findAll()
	{
		return postService.findAll();
		
	}
	
	@GetMapping("/post/{id}")
	Post findById(@PathVariable int id)
	{
		return postService.findById(id);
		
	}
	
	
	@GetMapping("/postimg/{fileName}")
	ResponseEntity<?> getImage(@PathVariable(name="fileName") String fileName) throws IOException{
		String filePath = AppConstant.FILE_UPLOAD_DIR + "\\" + fileName;
		byte[] image = Files.readAllBytes(new File(filePath).toPath());
			
		if(fileName.contains(".jpg") || fileName.contains(".jpeg")) {
			return ResponseEntity
					.status(HttpStatus.OK)
					.contentType(MediaType.IMAGE_JPEG)
					.body(image);	
		} else {
		return ResponseEntity
				.status(HttpStatus.OK)
				.contentType(MediaType.IMAGE_JPEG)
				.body(image);
		}
	}
	
	@PutMapping("/post")
	void update(@RequestBody Post post)
	{
		postService.save(post);
	}
	@PostMapping("/post")
	void save(@RequestBody Post post)
	{
		postService.save(post);
		
	}
	

	@PostMapping("/post/upload/{u_id}")
	void uploadPost(@PathVariable(name="u_id") int u_id, @RequestParam("file") MultipartFile file, @RequestParam("text") String text) throws IOException {
		Files.copy(file.getInputStream(), Paths.get(AppConstant.FILE_UPLOAD_DIR + "\\" + file.getOriginalFilename()));
		Post post = new Post();
		post.setU_id(u_id);
		post.setText(text);
		post.setImage(file.getOriginalFilename());
		
		postService.save(post);
	}
	
	@DeleteMapping("/post/{id}")
	void deleteById(@PathVariable int id)
	{
		postService.deleteById(id);
		
	}
	
	
	
}