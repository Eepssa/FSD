package com.ibm.maven.PlayStoreAop.AppConfig;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ibm.maven.PlayStoreAop.Service.App;
@Configuration
@ComponentScan("com.ibm.maven.PlayStoreAop*")
public class AppConfig {
	@Bean
	Map<Integer,App> getPlaystoreApp()
	{
		Map<Integer,App> map=new HashMap<Integer,App>();
		map.put(1,new App(10,"Tiktok",false) );
		map.put(2,new App(11,"Swiggy",true) );
		map.put(3,new App(12,"FB",true) );
		map.put(4,new App(13,"IG",true) );
		return map;
	}
}
