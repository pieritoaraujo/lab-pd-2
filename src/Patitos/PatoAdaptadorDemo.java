package Patitos;

public class PatoAdaptadorDemo {

    public static void main(String[] args) {

        PatoReal pato = new PatoReal();
        SuperDrone superDrone = new SuperDrone();
        Pato adaptadorDrone = new AdaptadorDrone(superDrone);

        System.out.println("El drone hace...");
        superDrone.beep();
        superDrone.girarRotor();

        System.out.println("El pato hace...");
        testPato(pato);

        System.out.println("El adaptador drone hace...");
        testPato(adaptadorDrone);
    }

    public static void testPato(Pato pato) {
        pato.cuaquear();
        pato.volar();
    }
}