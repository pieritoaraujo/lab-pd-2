/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Patitos;

/**
 *
 * @author sistemas
 */
public class SimPato {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Pato PatoReal = new PatoReal();
        PatoReal.mostrar();
        PatoReal.realizarCuaqueo();
        PatoReal.realizarVuelo();
        PatoReal.nadar();

        Pato PatoDeGoma = new PatoDeGoma();
        PatoDeGoma.mostrar();
        PatoDeGoma.realizarCuaqueo();
        PatoDeGoma.realizarVuelo();
        PatoDeGoma.nadar();
        
        Pato PatoSenuelo = new PatoSenuelo();
        PatoSenuelo.mostrar();
        PatoSenuelo.realizarCuaqueo();
        PatoSenuelo.realizarVuelo();
        PatoSenuelo.nadar();

        Pato PatoCabezaRoja = new PatoCabezaRoja();
        PatoCabezaRoja.mostrar();
        PatoCabezaRoja.realizarCuaqueo();
        PatoCabezaRoja.realizarVuelo();
        PatoCabezaRoja.nadar();

        
    }
    
}
