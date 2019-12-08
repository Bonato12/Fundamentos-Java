/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejodevariables;

/**
 *
 * @author Seba-
 */
public class ManejoDeVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Variables booleanas
        boolean bool1;
        bool1 = true;
        boolean bool2 = false;
        System.out.println("Valor de Bool1 es: "+bool1);
        System.out.println("Valor de Bool2 es: "+ bool2);
        
        //Variables bytes
        byte b1 = 10;
        // En Hexadecimal es igual a 10
        byte b2 = 0xa;
        System.out.println("El valor de b1 es: "+b1);
        System.out.println("El valor de b2 es: "+b2);
        
        //Variables Short
        short s1 = 2;
        System.out.println("El valor de s1 es: "+ s1);
        
        // Variables Char
        char ch1 = 65, ch2 = 'A';
        System.out.println("Valor de ch1 es: "+ ch1);
        System.out.println("Valor de ch2 es: "+ ch2);
        
        //Variables Enteras
        int entero1 = 100;
        int entero2 = 50;
        System.out.println("Valor de entero1 es: "+ entero1);
        System.out.println("Valor de entero2 es:"+ entero2);
        
        // Variables LONG  
        long long1 = 70;
        long long2 = 20L;
        System.out.println("El valor de long1 es:"+ long1);
        System.out.println("El valor de long2 es:"+ long2);
        
        // Variables float
        float f1 = 15;
        float f2 = 22.3F;
        System.out.println("El valor de f1 es de:"+f1);
        System.out.println("El valor de f2 es de:"+f2);
        
        // Variables double
        double d1 = 20;
        double d2 = 15.3D;
        System.out.println("El valor de d1 es de:"+d1);
        System.out.println("El valor de d2 es de:"+d2);
        
        
        
    }
    
}
