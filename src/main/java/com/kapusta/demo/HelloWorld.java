package com.kapusta.demo;

import com.kapusta.annotation.GetEndpoint;
import com.kapusta.annotation.Restful;

@Restful
public class HelloWorld {

    @GetEndpoint(path = "/hello")
    public String helloWorld(){
        return "Hello world";
    }
}
