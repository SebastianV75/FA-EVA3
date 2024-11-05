/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_3_captura;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class EVA3_3_CAPTURA {

    public static void main(String[] args) {
        String nombre = capturarTexto("Introduce tu nombre: ");
        String apellido = capturarTexto("Introduce tu apellido: ");
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        
        int edad = capturarEntero("Introduce tu edad: ");
        double salario = capturarDoble("Introduce tu salario: ");
        
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
    }
    
    //CAPTURAR TEXTO
    public static String capturarTexto(String mensaje){
        Scanner captu = new Scanner(System.in);
        System.out.println(mensaje);
        String texto = captu.nextLine();
        return texto;
        
    }
    //CAPTURAR ENTERO
     public static int capturarEntero(String mensaje){
        Scanner captu = new Scanner(System.in);
        System.out.println(mensaje);
        int entero = captu.nextInt();
        captu.nextLine();
        return entero;
        
    }
     //CAPTURAR DOBLE
      public static double capturarDoble(String mensaje){
        Scanner captu = new Scanner(System.in);
        System.out.println(mensaje);
        double doble = captu.nextDouble();
        captu.nextLine();
        return doble;
        
    }
}
