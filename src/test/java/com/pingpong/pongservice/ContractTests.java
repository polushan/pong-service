package com.pingpong.pongservice;


import com.pingpong.pongservice.web.PongController;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;

public class ContractTests {

    @Before
    public void setUp() {
        RestAssuredMockMvc.standaloneSetup(new PongController());
    }
}
