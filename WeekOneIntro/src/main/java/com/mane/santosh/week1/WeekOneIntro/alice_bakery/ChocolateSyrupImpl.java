package com.mane.santosh.week1.WeekOneIntro.alice_bakery;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "cake.type",havingValue = "chocolate")
public class ChocolateSyrupImpl implements Syrup{

    @Override
    public void getSyrupType() {
        System.out.println("getting syrup for chocolate cake");
    }

}
