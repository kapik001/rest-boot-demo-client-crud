package com.kapusta.demo;

import com.kapusta.annotation.Restful;
import com.kapusta.annotation.endpoints.GetEndpoint;

@Restful
public class Test {
    private final TestService testService;

    public Test(TestService testService) {
        this.testService = testService;
    }

    @GetEndpoint(path = "/test")
    public int test(){
        return this.testService.getRandomNumber();
    }
}
