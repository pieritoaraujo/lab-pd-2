/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patitos;

/**
 *
 * @author sistemas
 */
public class PatoSenuelo extends Pato {
    public PatoSenuelo(){
        Cuaqueable c2 = new CuaqueoMudo();
        Volable v2 = new NoVuela();
        }
    @Override
    public void mostrar(){
        System.out.println("Yo soy Pato señuelo");
    }
    
}
