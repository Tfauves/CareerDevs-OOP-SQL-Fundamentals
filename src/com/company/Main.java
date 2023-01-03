package com.company;

import com.company.Inheritance.CoffeeMaker;
import com.company.Inheritance.EspressoMachine;

public class Main {

    public static void main(String[] args) {
	// write your code here

        CoffeeMaker homeBrewer = new CoffeeMaker();
        homeBrewer.turnOn();
        homeBrewer.brew();

        EspressoMachine emachine = new EspressoMachine();

        emachine.turnOn();
        emachine.grindBeans();
        emachine.frothMilk();

        emachine.brew();
        emachine.brew("double");

    }
}
