package com.ibm.maven.AirFlight;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ibm.maven.AirFlight.vo.Airline;
import com.ibm.maven.AirFlight.vo.Airport;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
        ctx.scan("com.ibm.maven.AirFlight.*");
        ctx.refresh();
        
        Airport port= ctx.getBean(Airport.class);
        System.out.println(port);
       
      
    }
}
