package com.mane.santosh.week1.WeekOneIntro.alice_bakery;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "cake.type",havingValue = "chocolate")
public class ChocolateFrostingImpl implements Frosting{
    @Override
    public void getFrostingType() {
        System.out.println("getting frosting for choclate cake");
    }
}
