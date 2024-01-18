package com.js.implementation;

import com.js.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MichelinTyres implements Tyres {

    public MichelinTyres(){
        System.out.println("MichelinTyres bean is created by spring");
    }
    public String rotate(){
        return "Vehicle moving with Michelin tyres";
    }

}
