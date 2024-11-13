/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_6_examen_2da;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class EVA3_6_EXAMEN_2DA {
    
    public static final int PIEDRA = 1;
    public static final int PAPEL = 2;
    public static final int TIJERA = 3;
    
    public static final int EMPATE = 0;
    public static final int GANA = 1;
    public static final int PIERDE = 2;

    public static void main(String[] args) {
        int jugadaUsu;
        int jugadaComp;
        int resuJugada;
        int empates = 0;
        int victorias = 0;
        int derrotas = 0;
        do{
            
        jugadaUsu = capturarJugada("Introduce tu jugada (1-PIERDRA, 2-PAPEL, 3-TIJERAS, 4-SALIR)");
            
        jugadaComp = generarJugadaComp();
        
            switch (jugadaComp) {
                case 1:
                    System.out.println("Maquina selecciono PIEDRA");
                    break;
                case 2:
                    System.out.println("Maquina selecciono PAPEL");
                    break;
                case 3:
                    System.out.println("Maquina selecciono TIJERAS");
                    break;
                default:
                    System.out.println();
            }
            
            resuJugada = evaluarJugadas(jugadaUsu, jugadaComp);
            
            switch (resuJugada) {
                case 0:
                    System.out.println("EMPATE");
                    empates++;
                    break;
                case 1:
                    System.out.println("GANA HUMANO");
                    victorias++;
                    break;
                case 2:
                    System.out.println("GANA MAQUINA");
                    derrotas++;
                    break;
                default:
                    System.out.println();
            }
            
            
        }while(jugadaUsu != 4); //Mientras no quiera salir (opcion 4)
        System.out.println("Victorias HUMANO: " + victorias);
        System.out.println("Victorias MAQUINA: " + derrotas);
        System.out.println("EMPATES: " + empates);
    }
    
    //PEDIR LOS DATOS AL USUARIO
    public static int capturarJugada(String mensaje){
        Scanner captu = new Scanner(System.in);
        System.out.println(mensaje);
        int resu = captu.nextInt();
        captu.nextLine();
        return resu;
    }
    //GENERAR JUGADA DE LA COMPUTADORA
    public static int generarJugadaComp(){
        int resu = 0;
        double valor = Math.random();
        
        if (valor <=0.33) {
            resu = 1;
        } else if (valor>0.33 && valor <=0.66 ) {
            resu = 2;
        } else if (valor > 0.66 && valor <1.0) {
            resu = 3;
        }
        
       return resu;
    }
    
    //EVALUAR JUGADAS: 0-EMPATE, 1-GANO, 2-PERDIO
    public static int evaluarJugadas(int jugadaU, int jugadaC){
        //9 POSIBLES COMBINACIONES
        int resu;
        if ((jugadaU == PIEDRA && jugadaC == TIJERA) || (jugadaU == PAPEL && jugadaC == PIEDRA) || (jugadaU == TIJERA && jugadaC == PAPEL)) {
            resu = GANA;
        } else if (jugadaU == jugadaC) {
            resu = EMPATE;
        } else{
            resu = PIERDE;
        }
        return resu;
    }
}
