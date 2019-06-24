package com.pingpong.pongservice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource(properties = {"vcap.application.uris[0]=test"})
public class PongServiceApplicationTests {

	@Test
	public void contextLoads() {
	}

}
