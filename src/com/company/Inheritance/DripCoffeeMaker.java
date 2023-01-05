package com.company.Inheritance;

public class DripCoffeeMaker extends CoffeeMaker{
    private boolean isButtonPress;


    @Override
    public void cleaningRequired() {
        System.out.println("please clean water reservoir");
    }

    @Override
    public void executeCleaningCycle() {
        System.out.println("cleaning cycle started");

    }

    public void pressCleaningButton() {
        if (isOn) {
            if (!isButtonPress) {
                executeCleaningCycle();
                System.out.println("water reservoir cleaned");
                isButtonPress = false;
            }
        }

    }


}
