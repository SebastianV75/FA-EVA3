/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fp_eva3_examen_24550268;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class FP_EVA3_EXAMEN_24550268 {
    
    static Scanner captu = new Scanner(System.in);

    public static void main(String[] args) {
        int califa;
        int calificacionesMayores;
        int calificacionMenor;
        int calificacionMayor;
        
        System.out.println("Cuantos alumnos son?");
        int numAlumnos = capturar();
        int[] alumnos = new int [numAlumnos];
        
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Cual fue la calificacion de alumno #" + i + " (0-100)");
            califa = captu.nextInt();
            alumnos[i] = califa;
            
        }
        
        double promedio = calcularPromedio(alumnos);
        calificacionesMayores = contarCalificacionMayores(alumnos,promedio);
        calificacionMayor = obtenerCalificacionMasAlta(alumnos); 
        calificacionMenor = obtenerCalificacionMasBaja(alumnos);
        
       imprimirResultados(promedio, calificacionesMayores, calificacionMayor, calificacionMenor);
    }
    
    public static int capturar(){
    int resu;
    resu = captu.nextInt();
    return resu;
    }
    
    public static double calcularPromedio(int[] arr){
        int suma = 0;
        for (int num : arr) {
            suma += num;
        }
        return (double) suma/arr.length;
    }
    
    public static int contarCalificacionMayores(int[] arr, double promedio){
      
        int acum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (promedio <= arr[i]) {
                acum++;
            }
        }
        return acum;
    }
    
    public static int obtenerCalificacionMasAlta(int[]arr){
       int mayor = 0;
        for(int num:arr){
            if (num>mayor) {
                mayor = num;
            }
        }
        
        return mayor;
    }
    
    public static int obtenerCalificacionMasBaja(int[]arr){
       int menor = arr[0];
        for(int num:arr){
            if (num<menor) {
                menor= num;
            }
        }
        
        return menor;
    }
    
    public static void imprimirResultados(double promedio, int califaM, int califaA , int califaB){
        System.out.println("Promedio de calificaciones: " + promedio);
        System.out.println("Promedio de calificaciones mayores o iguales al promedio: " + califaM);
        System.out.println("Calificacion mas baja: " + califaA);
        System.out.println("Calificacion mas alta: " + califaB);
    }
}
