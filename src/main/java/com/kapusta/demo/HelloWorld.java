package com.kapusta.demo;

import com.kapusta.annotation.Restful;
import com.kapusta.annotation.endpoints.GetEndpoint;

@Restful
public class HelloWorld {

    @GetEndpoint(path = "/hello")
    public String helloWorld(){
        return "Hello world";
    }
}
