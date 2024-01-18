package com.js.implementation;

import com.js.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyres implements Tyres {

    public BridgeStoneTyres(){
        System.out.println("BridgeStoneTyres bean is created by spring");
    }

    public String rotate(){
        return "Vehicle moving with BridgeStone tyres";
    }
}
