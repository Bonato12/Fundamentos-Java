/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejodeoperadores;

/**
 *
 * @author Seba-
 */
public class ManejoDeOperadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Operadores Aritmeticos");
        int a = 1 + 2;
        int b = a + 4;
        int c = b / 2;
        int d = c - a;
        int e = -d;
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
        System.out.println("c = "+ c);
        System.out.println("d = "+ d);
        System.out.println("e = "+ e);
        
        System.out.println("Operador Modulo");
        System.out.println("x mod 2"+ a % 2);
        
        System.out.println("Operador Compuesto");
        a += 2;
        b -= 4;
        c *= 4;
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
        System.out.println("c = "+ c);
        
        System.out.println("Operador Incremento");
        // int a = a + 1;
        a++;
        System.out.println("a = "+ a);

        
        System.out.println("Operador Relacional");
        boolean res = a < b;
        System.out.println("res = " + res);
        
              
        
        

    }
    
}
