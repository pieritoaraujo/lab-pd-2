package Patitos;

public class SuperDrone implements Drone {

    @Override
    public void beep() {
        System.out.println("Beep beep!");
    }
    @Override
    public void girarRotor() {
        System.out.println("Rotor girando");
    }
    @Override
    public void despegar() {
        System.out.println("Drone despegando");
    }
}
