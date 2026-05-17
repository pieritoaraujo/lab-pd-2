public class MonitorTiempo {
    private float temperatura;
    private Pantalla pantalla;

    public MonitorTiempo(Pantalla pantalla, float temperatura) {
        this.pantalla = pantalla;
        this.temperatura = temperatura;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void mostrarEnPantalla(){
      pantalla.mostrarEnPantalla(temperatura);
    }
}
