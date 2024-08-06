package com.aurionpro.structural.decorator.test;

import com.aurionpro.structural.decorator.model.GoldenHat;
import com.aurionpro.structural.decorator.model.IHat;
import com.aurionpro.structural.decorator.model.PremiumHat;
import com.aurionpro.structural.decorator.model.RibbonedHat;
import com.aurionpro.structural.decorator.model.StandardHat;

public class HatDecoratorTest {
    public static void main(String[] args) {
        IHat standardHat = new StandardHat();
        System.out.println(standardHat.getName() + " - " + standardHat.getPrice() + " - " + standardHat.getDescription());

        IHat goldenStandardHat = new GoldenHat(standardHat);
        System.out.println(goldenStandardHat.getName() + " - " + goldenStandardHat.getPrice() + " - " + goldenStandardHat.getDescription());

        IHat ribbonedPremiumHat = new RibbonedHat(new PremiumHat());
        System.out.println(ribbonedPremiumHat.getName() + " - " + ribbonedPremiumHat.getPrice() + " - " + ribbonedPremiumHat.getDescription());

        IHat fullyDecoratedHat = new GoldenHat(new RibbonedHat(new PremiumHat()));
        System.out.println(fullyDecoratedHat.getName() + " - " + fullyDecoratedHat.getPrice() + " - " + fullyDecoratedHat.getDescription());
    }
}

