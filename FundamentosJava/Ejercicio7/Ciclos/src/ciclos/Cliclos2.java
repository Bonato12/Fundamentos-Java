/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclos;

import java.util.Scanner;

/**
 *
 * @author Seba-
 */
public class Cliclos2 {
    
    public static void main(String[] args) {
        System.out.println("Por favor ingrese la cantidad de veces a iterar");
        int maxElementos;
        Scanner entrada = new Scanner(System.in);
        maxElementos = entrada.nextInt();
        int contador = 0;
        while (contador < maxElementos){
            System.out.println("contador = "+ contador);
            contador++;
        }
    }
}
