package com.example.multimodule.application;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import com.example.multimodule.service.MyService;

@SpringBootTest
class DemoApplicationTest {

	@Autowired
	private MyService myService;

	@Value("${message.test}")
	private String test;

	@Test
	public void contextLoads() {
		assertThat(myService.message()).isNotNull();
		assertThat(test).isEqualTo("\"helloworldtest\"");
	}

}
