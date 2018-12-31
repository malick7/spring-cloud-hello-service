package io.malick;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class HelloServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloServiceApplication.class, args);
	}

	/*@RequestMapping
	public String hello(){
		return "Hello!!";
	}*/
	
	//Filter code
	@RequestMapping
	public String hello(@RequestHeader("x-location") String location){
		return "Hello from " + location + " !!";
	}
}

