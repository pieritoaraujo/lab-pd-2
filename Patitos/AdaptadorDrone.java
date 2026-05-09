package Patitos;

public class AdaptadorDrone implements Pato {
    Drone drone;
    public AdaptadorDrone(Drone drone) {
        this.drone = drone;
    }
    public void cuaquear() {
        drone.beep();
    }
    public void volar() {
        drone.girarRotor();
        drone.despegar();
    }
}
