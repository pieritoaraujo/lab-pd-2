/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patitos;

/**
 *
 * @author sistemas
 */
public class PatoDeGoma extends Pato {
    public PatoDeGoma(){
        cuaqueable  = new Chirreo();
        volable  = new NoVuela();
        }
    
    @Override
    public void mostrar() {
        System.out.println("Yo soy un Patito de goma");
    }
    
}
