package com.ibm.maven.PlayStoreAop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ibm.maven.PlayStoreAop.Service.App;
import com.ibm.maven.PlayStoreAop.Service.AppOperation;

@SpringBootApplication
public class PlayStoreAopApplication implements ApplicationRunner{
	@Autowired
	AppOperation apop;
	
	public static void main(String[] args) {
		SpringApplication.run(PlayStoreAopApplication.class, args);
		
	}
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
			System.out.println("--Running--");
		
		apop.upload(new App(5,"Tiktok",false));
		apop.download(5);
		apop.getList();
		
		
}}
