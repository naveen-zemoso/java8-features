package com.learn.inheritence;

public class MountainBicycle extends Bicycle {

    private int seatHeight;


    public MountainBicycle(int cadence, int gear, int speed, int seatHeight) {
        super(cadence, gear, speed);
        this.seatHeight = seatHeight;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    @Override
    public String toString() {
        return "MountainBicycle{" +
                "seatHeight=" + seatHeight +
                " speed = " + getSpeed() +
                '}';
    }
}
