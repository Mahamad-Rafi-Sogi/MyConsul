package com.project.myconsule;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = "spring.cloud.consul.config.enabled=false")
class MyConsulApplicationTests {

	@Test
	void contextLoads() {
	}

}
