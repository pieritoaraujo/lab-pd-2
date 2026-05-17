import java.util.ArrayList;
import java.util.List;
public class MonitorTiempo {

    private List<Observer> observers = new ArrayList<>();
    private float temp;

    public void agregarObserver (Observer o){
        observers.add(o);
    }

    public void eliminarObserver(Observer o){
        observers.remove(o);
    }

    public void notificarObserver (){
        for (Observer o: observers){
            o.mostrar(temp);
        }
    }

    public void setTemp(float temp) {
        this.temp = temp;
        notificarObserver();
    }
}
