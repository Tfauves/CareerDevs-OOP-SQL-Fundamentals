package com.company.Inheritance;

public class EspressoMachine extends CoffeeMaker{
    private boolean needsCleaning;
    private int brewCounter = 0;

    @Override
    public void brew() {
        if (isOn) {
            System.out.println("brewing espresso");
            brewCounter++;
        }
    }

    public void brew(String size) {
        System.out.println("brewing " + size);
    }

    public void grindBeans() {
        if (isOn) {
            System.out.println("grinding beans");
        }

    }

    public void frothMilk() {
        if (isOn) {
            System.out.println("milk is frothing");
        }

    }

    @Override
    public void cleaningRequired() {
        if (brewCounter > 15) {
            needsCleaning = true;
            System.out.println("machine needs cleaning");
        }
    }

    @Override
    public void executeCleaningCycle() {
        brewCounter = 0;
        needsCleaning = false;
        System.out.println("cleaning cycle complete");
    }


}
