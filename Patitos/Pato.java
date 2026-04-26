/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patitos;

/**
 *
 * @author sistemas
 */
public abstract class Pato {
    protected Volable volable;
    protected Cuaqueable cuaqueable;

    public abstract void mostrar();

    public void setVolable(Volable volabledq){
        this.volable = volabledq;
    }
    public void setCuaqueable(Cuaqueable cuaqueablefq){
        this.cuaqueable = cuaqueablefq;
    }

    public void realizarVuelo(){
        volable.volar();
    }
    public void realizarCuaqueo(){
        cuaqueable.cuaqueable();
    }
    public void nadar(){
        System.out.println("TODOS LOS PATOS NADAN");
    }
}