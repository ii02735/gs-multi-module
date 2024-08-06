package com.example.multimodule.application;

import com.example.multimodule.service.MyService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "com.example.multimodule")
@PropertySource("classpath:my-properties.properties")
@RestController
public class DemoApplication {

	private final MyService myService;

	private final String messageTest;

	public DemoApplication(
		MyService myService, 
		@Value("${message.test}") String messageTest) {
		this.myService = myService;
		this.messageTest = messageTest;
	}

	@GetMapping("/")
	public String home() {
		System.out.println("hello world in sout3 %s".formatted(this.messageTest));
		return myService.message();
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
