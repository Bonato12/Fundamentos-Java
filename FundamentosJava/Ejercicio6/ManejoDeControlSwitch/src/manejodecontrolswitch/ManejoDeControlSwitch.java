/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejodecontrolswitch;

/**
 *
 * @author Seba-
 */
public class ManejoDeControlSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mes = 6;
        String estacion;
        
        switch(mes){
            case 1: case 2: case 3:
                estacion = "Verano";
                break;
            case 4: case 5: case 6:
                estacion = "Otoño";
                break;
            case 7: case 8: case 9:
                estacion = "Invierno";
            case 10: case 11: case 12:
                estacion = "Verano";
            default:
                estacion = "Mes incorrecto";
                    
        }
        
        System.out.println("El mes es "+ mes + " y la estacion es " + estacion);
    }
    
}
