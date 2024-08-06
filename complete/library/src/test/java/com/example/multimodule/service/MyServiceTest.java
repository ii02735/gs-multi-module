package com.example.multimodule.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource("classpath:my-properties.properties")
public class MyServiceTest {

	//@Autowired
	//private MyService myService;

	@Value("${message.test}")
	private String test;

	@Test
	public void contextLoads() {
		//assertThat(myService.message()).isNotNull();
		assertThat(test).isNotNull();
		assertThat(test).isEqualTo("\"helloworldtest\"");
	}

	@SpringBootApplication
	static class TestConfiguration {
	}

}
