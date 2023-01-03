package com.company.Inheritance;

public class CoffeeMaker {
    boolean isOn = false;

    public void turnOn() {
        if(!isOn) System.out.println("power is on");
        isOn = true;

    }

    public void turnOff() {
        if(isOn) System.out.println("power is off");
        isOn = false;
    }

    public void brew() {
        if (isOn) {
            System.out.println("brew starting");
        } else {
            System.out.println("please turn maker on before brewing");
        }
    }
}
