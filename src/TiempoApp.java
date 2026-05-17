void main() {
    MonitorTiempo MT = new MonitorTiempo();

    MT.agregarObserver(new PantallaLCD());
    MT.agregarObserver(new VentanaDeComputador());
    MT.agregarObserver(new PantallaDeRelojInteligente());

    MT.setTemp(20);
}