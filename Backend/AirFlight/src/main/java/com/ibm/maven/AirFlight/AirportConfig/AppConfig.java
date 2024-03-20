package com.ibm.maven.AirFlight.AirportConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ibm.maven.AirFlight.vo.Airline;

import java.util.*;
@Configuration
@ComponentScan("com.ibm.maven.AirFlight*")
public class AppConfig {
	
   @Bean(name="air")
	List<Airline> getAirlineList()
	{
		List<Airline> airline= new ArrayList<>();
		airline.add(new Airline("ars","air asia"));
		airline.add(new Airline("ind","indigo"));
		return airline;
	}
	@Bean
	Map<String,List<Airline>> getAirportFlight()
	{
		Map<String,List<Airline>> fl1= new HashMap<>();
//		fl1.put("ccu",Arrays.asList());
		fl1.put("ccu", getAirlineList());
		return fl1;
	}
	
	
	
	
}
