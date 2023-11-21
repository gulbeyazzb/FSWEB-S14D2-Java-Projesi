package com.workintech;

public class Lamp {
    private LampType style;
    private boolean battery;
    private int globrating;

    public Lamp(LampType style, boolean battery, int globrating) {
        this.style = style;
        this.battery = battery;
        this.globrating = globrating;
    }

    public void turnOn(){
        System.out.println("Lamp is being turned on");
    }

    public LampType getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobrating() {
        return globrating;
    }
}
