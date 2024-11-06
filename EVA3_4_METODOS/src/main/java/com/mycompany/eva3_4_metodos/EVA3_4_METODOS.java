/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_4_metodos;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class EVA3_4_METODOS {

    public static void main(String[] args) {
        System.out.println(encontrarMayor(8, 7));
        
        System.out.println("Tu dia es: " + devolverDiaSem(1));
        
    }
    
    //VALOR MAS GRANDE ENTRE DOS NUMEROS ENTEROS
    public static int encontrarMayor(int num1, int num2) {
        /*int resu;
        if (num1 > num2) {
            resu = num1;
        }else{
            resu = num2;
        }
        return resu;*/
        
        if (num1 > num2) {
            return num1;
        } else{
            return num2;
        }
        
    }
    
    //DIAS DE LA SEMANA
    public static String devolverDiaSem(int dSem) {
        
        
        switch (dSem) {
            case 1:
               
                return "Domingo";
                
            case 2:
                
                return "Lunes";
            case 3:
                
                return "Martes";
            case 4:
               
                return "Miercoles";
            case 5:
              
                return "Jueves";
            case 6:
                return "Viernes";
            case 7:
            
                return "Sabado";
            default:
                return "Dia no valido";
        }
        
        
    }
}
