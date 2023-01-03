package com.kapusta.demo;

import com.kapusta.annotation.Injectable;

import java.util.Random;

@Injectable
public class TestService {

    public int getRandomNumber(){
        return new Random().nextInt();
    }

}
