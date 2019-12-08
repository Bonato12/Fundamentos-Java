/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentenciasdecontrol;

/**
 *
 * @author Seba-
 */
public class SentenciasDeControl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // if/else
        int x = 20;
        
        if (x > 15){
            System.out.println("El numero es mayor a 15");
        }else{
            System.out.println("El numero es menor o igual a 15");
        }
        
        // if/else if/else
        int numero = 30;
        
        if (numero == 10){
            System.out.println("el numero es igual a 10");
        }else if(numero == 20){
            System.out.println("el numero es igual a 20");
        }else if (numero == 30){
            System.out.println("el numero es igual a 30");
        }else{
            System.out.println("el numero no es igual a 10,20 ni 30");
        }
    }
    
}
