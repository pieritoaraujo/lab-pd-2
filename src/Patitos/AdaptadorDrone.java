package Patitos;

public class AdaptadorDrone implements Pato {
    private final Drone drone;
    public AdaptadorDrone(Drone drone) {
        this.drone = drone;
    }
    @Override
    public void cuaquear() {
        drone.beep();
    }
    @Override
    public void volar() {
        for(int i=0; i<5; i++) {
            drone.girarRotor();
            drone.despegar();
        }
    }
}
