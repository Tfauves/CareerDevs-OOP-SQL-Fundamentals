package com.company.Inheritance;

public class EspressoMachine extends CoffeeMaker{
    boolean needsCleaning;
    String size = "single";

    public void grindBeans() {
        System.out.println("grinding beans");
    }

    public void frothMilk() {
        System.out.println("milk is frothing");
    }

}
