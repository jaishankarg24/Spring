package com.js.implementation;

import com.js.interfaces.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeakers implements Speakers {

    public SonySpeakers(){
        System.out.println("SonySpeakers bean is created by spring");
    }
    public String makeSound(){
        return "Playing music with Sony speakers";
    }

}
