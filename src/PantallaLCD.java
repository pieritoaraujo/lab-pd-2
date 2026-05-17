public class PantallaLCD implements Pantalla{
    @Override
    public void mostrarEnPantalla(float numero){
        System.out.println("La temperatura de la Pantalla LCD es: " +numero);
    }
}
