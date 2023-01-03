package com.company.Inheritance;

public class EspressoMachine extends CoffeeMaker{
    private boolean needsCleaning = false;
    private int brewCounter = 0;

    @Override
    public void brew() {
        if (isOn) {
            System.out.println("brewing espresso");
            brewCounter++;
        }
    }

    public void brew(String size) {
        if (size.equals("single")) System.out.println("brewing single");
        if (size.equals("double")) System.out.println("brewing double");
    }

    public void signalCleaning() {
        if (brewCounter > 15) {
            needsCleaning = true;
            System.out.println("machine needs cleaning");
        }
    }

    public void runCleaningCycle() {
        brewCounter = 0;
        needsCleaning = false;
        System.out.println("cleaning cycle complete");
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

}
