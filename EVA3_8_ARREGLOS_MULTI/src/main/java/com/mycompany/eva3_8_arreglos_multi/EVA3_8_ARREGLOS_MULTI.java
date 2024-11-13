/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_8_arreglos_multi;

/**
 *
 * @author sebas
 */
public class EVA3_8_ARREGLOS_MULTI {

    public static void main(String[] args) {
        int [][][] cubo = new int [2][5][3];
        //LLENADO MATRIZ
        for (int i = 0; i < 2; i++) { //1ERA DIMENSION
            for (int j = 0; j < 5; j++) { //2DA DIMENSION
                for (int k = 0; k < 3; k++) { //3RA DIMENSION
                   cubo[i][j][k] = (int)(Math.random() * 100); 
                }
            }
        }
        //IMRPRIMIR VALORES
        for (int i = 0; i < 2; i++) { //1ERA DIMENSION
            for (int j = 0; j < 5; j++) { //2DA DIMENSION
                for (int k = 0; k < 3; k++) { //3RA DIMENSION
                    System.out.print("[" + cubo[i][j][k] + "]");
                }
            }
        }
    }
}
