package com.driver;
public class F1  extends Car {
    public F1(String name, boolean isManual) {
        super(name, 4, 4, 6, isManual, "sport",5);
    }

    public void accelerate(int rate) {
        int newSpeed = 0;
        newSpeed = rate + getCurrentSpeed();
        if (newSpeed == 0) {
            stop();
            changeGear(1);
        }
        if (newSpeed > 250) {
            changeGear(6);
            changeSpeed(newSpeed, getCurrentDirection());
        } else if (newSpeed > 200) {
            changeGear(5);
            changeSpeed(newSpeed, getCurrentDirection());
        } else if (newSpeed > 150) {
            changeGear(4);
            changeSpeed(newSpeed, getCurrentDirection());
        } else if (newSpeed > 100) {
            changeGear(3);
            changeSpeed(newSpeed, getCurrentDirection());
        } else if (newSpeed > 50) {
            changeGear(2);
            changeSpeed(newSpeed, getCurrentDirection());
        } else if (newSpeed > 0) {
            changeGear(1);
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}