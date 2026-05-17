public class VentanaDeComputador implements Observer{
    @Override
    public void mostrar(float temp){
        System.out.println("La Temperatura en la Ventana es: " +temp);
    }
}
