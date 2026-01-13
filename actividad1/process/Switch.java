package edu.juan.arteaga.actividad1.ui;


public class Switch {

    private boolean isOn;

    public void switchOn() {
        isOn = true;
    }
    public void switchOff() {
        isOn = false;
    }
    public boolean isOn() {
        return isOn;
    }
}