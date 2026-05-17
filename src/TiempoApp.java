public class TiempoApp {
    static void main() {
        MonitorTiempo lcdmonitor =
                new MonitorTiempo(new PantallaLCD(), 20.0f);

        MonitorTiempo ventanadecomputador =
                new MonitorTiempo(new VentanaDeComputador(), 20.0f);

        MonitorTiempo pantallarelojinteligente =
                new MonitorTiempo(new PantallaDeRelojInteligente(), 20.0f);

        lcdmonitor.mostrarEnPantalla();
        ventanadecomputador.mostrarEnPantalla();
        pantallarelojinteligente.mostrarEnPantalla();
    }
}
