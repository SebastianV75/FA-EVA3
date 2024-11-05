/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_2_retorno;

/**
 *
 * @author sebas
 */
public class EVA3_2_RETORNO {

    public static void main(String[] args) {
        //Necesitamos recuperar el valor, para hacer algo con el
        int resu;
        resu = sumarDosNumeros(5, 10);
        System.out.println("Resultado = " + resu);
        // Segunda alternativa, solo lo necesitas una vez
        System.out.println("Resultado = " + sumarDosNumeros(5,10));
        //No les interesa el resultado
        sumarDosNumeros(100,200); //El resultado se pierde
    }
    
    public static int sumarDosNumeros(int num1, int num2){
        return num1 + num2;
    }
}
