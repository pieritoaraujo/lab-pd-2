public class PantallaDeRelojInteligente implements Observer{
    @Override
    public void mostrar (float temp){
        System.out.println("La Temperatura en la Pantalla de Reloj Inteligente es: " +temp);
    }
}
