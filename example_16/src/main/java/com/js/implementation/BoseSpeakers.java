package com.js.implementation;

import com.js.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speakers {

    public BoseSpeakers() {
        System.out.println("BoseSpeakers bean is created by spring");
    }

    public String makeSound(){
        return "Playing music with Bose speakers";
    }

}
