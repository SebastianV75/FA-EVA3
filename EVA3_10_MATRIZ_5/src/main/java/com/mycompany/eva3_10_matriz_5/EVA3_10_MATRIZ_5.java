/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_10_matriz_5;

/**
 *
 * @author sebas
 */
public class EVA3_10_MATRIZ_5 {

    public static void main(String[] args) {
        int [][][][][] cinco = new int [2][3][4][5][6];
        
        for (int i = 0; i < cinco.length; i++) {
            for (int j = 0; j < cinco[i].length; j++) {
                for (int k = 0; k < cinco[i][j].length; k++) {
                    for (int l = 0; l < cinco[i][j][k].length; l++) {
                        for (int m = 0; m < cinco[i][j][k][l].length; m++) {
                            cinco[i][j][k][l][m] = (int)(Math.random() * 100); 
                        }
                    }
                }
            }
        }
        
        
        for (int i = 0; i < cinco.length; i++) {
            for (int j = 0; j < cinco[i].length; j++) {
                for (int k = 0; k < cinco[i][j].length; k++) {
                    for (int l = 0; l < cinco[i][j][k].length; l++) {
                        for (int m = 0; m < cinco[i][j][k][l].length; m++) {
                            System.out.print("[" + cinco[i][j][k][l][m] + "]"); 
                        }
                    }
                }
            }
        }
    }
}
