public class PantallaLCD implements Observer{
    @Override
    public void mostrar (float temp){
        System.out.println("La Temperatura en la Pantalla LCD es:" +temp);
    }
}
