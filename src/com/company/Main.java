package com.company;

import com.company.Inheritance.CoffeeMaker;
import com.company.Inheritance.DripCoffeeMaker;
import com.company.Inheritance.EspressoMachine;

public class Main {

    public static void main(String[] args) {
	// write your code here

        DripCoffeeMaker drip = new DripCoffeeMaker();

        drip.turnOn();
        drip.brew();
        drip.pressCleaningButton();


        EspressoMachine emachine = new EspressoMachine();

        emachine.turnOn();
        emachine.grindBeans();
        emachine.frothMilk();

        emachine.brew();
        emachine.brew("single");
        emachine.brew();
        emachine.brew();
        emachine.brew();
        emachine.brew();
        emachine.brew();
        emachine.brew();
        emachine.brew();
        emachine.brew();
        emachine.brew();
        emachine.brew();
        emachine.brew();
        emachine.brew();
        emachine.brew();
        emachine.brew();
        emachine.brew();
        emachine.executeCleaningCycle();
        emachine.frothMilk();

    }
}
