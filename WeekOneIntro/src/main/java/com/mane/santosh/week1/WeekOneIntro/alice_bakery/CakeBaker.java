package com.mane.santosh.week1.WeekOneIntro.alice_bakery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CakeBaker {

    @Autowired
    Frosting frosting;
    @Autowired
    Syrup syrup;



    public void bakeCake(){
        frosting.getFrostingType();
        syrup.getSyrupType();

        System.out.println("cake baked successfully");
    }
}
