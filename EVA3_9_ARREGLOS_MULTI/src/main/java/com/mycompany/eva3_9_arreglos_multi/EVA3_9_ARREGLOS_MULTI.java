/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_9_arreglos_multi;

/**
 *
 * @author sebas
 */
public class EVA3_9_ARREGLOS_MULTI {

    public static void main(String[] args) {
        int[] billetes = {20, 50, 100, 200, 500, 1000};
        
        String[][] ciudades = {{"Aguascalientes", "Calvillo","Jesus Maria"},
                               {"Ensenada", "Mexicali", "Tecate", "Tijuana"},
                               {"La Paz", "Cabo San Lucas", "San Jose del Cabo"}};
       
        for (int i = 0; i < ciudades.length; i++) {
            for (int j = 0; j < ciudades [i].length; j++) {
                System.out.print(ciudades[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
