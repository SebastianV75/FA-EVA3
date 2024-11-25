/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_juego_gato;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class EVA3_JUEGO_GATO {

    public static final int GANA = 1;       
    public static final int PIERDE = 2;

    public static void main(String[] args) {
        int filaComp;     
        int columnaComp;
        int partida = 4;
        int acum = 0;
        int repetir = 0;
        int acumHumana = 0;
        int acumComp = 0;
        int acumEmpate = 0;
        
        char[][] juego = new char[3][3]; 
        limpiarArreglo(juego);
        do{
        do{
            imprimirArreglo(juego);
            elegirCasillaArreglo(juego);
    
            if (verificarArreglo(juego) == GANA) {
                partida = GANA;
                break;
              
            }
        
        acum = acum + 2; 
            if (acum == 10) {       
                break; 
            }
            
            System.out.println("Turno de la computadora"); 
            do { 
                filaComp = generarMovimientoComp();   
        columnaComp = generarMovimientoComp();
                if (!(juego[filaComp][columnaComp] == 'x') && !(juego[filaComp][columnaComp] == '0') ) { 
                    break;
                }
                
            } while (true);
        
       juego[filaComp][columnaComp] = '0'; 
       
            if (verificarArreglo(juego) == PIERDE) {
                partida = PIERDE;
                break;
            }
            
            
        
        }while(acum != 10 && partida != GANA && partida != PIERDE); 
            switch (partida) {
                case GANA:
                    System.out.println("GANO Humano");
                    acumHumana++;
                    break;
                case PIERDE:
                    System.out.println("GANO Computadora");
                    acumComp++;
                    break;
                default:
                    System.out.println("EMPATE");
                    acumEmpate++;
                    break;
            }
                     imprimirArreglo(juego);
           do{  
          repetir = capturar("Quiere volver a jugar?  1--SI  2--NO");
          }while(repetir != 1 && repetir != 2);
            if (repetir == 1) {
                limpiarArreglo(juego);
                partida = 4;
                acum = 0;
            } else if (repetir == 2) {
                break;
            }
           
        }while(true);
        
        System.out.println("Partidas ganadas por el HUMANO: " + acumHumana );
        System.out.println("Partidas ganadas por la COMPUTADORA: " + acumComp );
        System.out.println("Partidas EMPATADAS: " + acumEmpate );
    }
    
    
    public static void elegirCasillaArreglo(char arreglo[][]){
        int casilla;
        do{
        casilla = capturar("Elija su casilla");
        
        if (casilla == 1) {
            if (arreglo[0][0] == 'x' || arreglo[0][0] == '0') {
                System.out.println("Casilla ocupada, elija otra");
                continue;
            }
            arreglo[0][0] = 'x';
            break;
        }
        if (casilla == 2) {
            if (arreglo[0][1] == 'x' || arreglo[0][1] == '0') {
                System.out.println("Casilla ocupada, elija otra");
                continue;
            }
            arreglo[0][1] = 'x';
            break;
        }
        if (casilla == 3) {
            if (arreglo[0][2] == 'x' || arreglo[0][2] == '0') {
                System.out.println("Casilla ocupada, elija otra");
                continue;
            }
            arreglo[0][2] = 'x';
            break;
        }
        if (casilla ==4) {
            if (arreglo[1][0] == 'x' || arreglo[1][0] == '0') {
                System.out.println("Casilla ocupada, elija otra");
                continue;
            }
            arreglo[1][0] = 'x';
            break;
        }
        if (casilla == 5) {
            if (arreglo[1][1] == 'x' || arreglo[1][1] == '0') {
                System.out.println("Casilla ocupada, elija otra");
                continue;
            }
            arreglo[1][1] = 'x';
            break;
        }
        if (casilla == 6) {
            if (arreglo[1][2] == 'x' || arreglo[1][2] == '0') {
                System.out.println("Casilla ocupada, elija otra");
                continue;
            }
            arreglo[1][2] = 'x';
            break;
        }
        if (casilla == 7) {
            if (arreglo[2][0] == 'x' || arreglo[2][0] == '0') {
                System.out.println("Casilla ocupada, elija otra");
                continue;
            }
            arreglo[2][0] = 'x';
            break;
        }
        if (casilla == 8) {
            if (arreglo[2][1] == 'x' || arreglo[2][1] == '0') {
                System.out.println("Casilla ocupada, elija otra");
                continue;
            }
            arreglo[2][1] = 'x';
            break;
        }
        if (casilla == 9) {
            if (arreglo[2][2] == 'x' || arreglo[2][2] == '0') {
                System.out.println("Casilla ocupada, elija otra");
                continue;
            }
            arreglo[2][2] = 'x';
            break;
        }
        }while(true);
    }
    
   
    
    public static int capturar(String mensaje){
        
        Scanner captu = new Scanner(System.in);
        int resu;
        
        System.out.println(mensaje);
        resu = captu.nextInt();
        captu.nextLine();
     
            
        return resu;
    }
    
    public static int generarMovimientoComp(){ 
        int resu = (int)(Math.random() * 10);
        if (resu<=3) {
            resu = 0;
        }else if (resu >3 && resu <=6) {
            resu = 1;
        }else{
            resu = 2;
        }
        return resu;
    }
    
    
    public static void imprimirArreglo(char arreglo[][]){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[ "+ arreglo[i][j] + " ]" );    
            }
                 System.out.println("");
        }
    }
    
    public static void limpiarArreglo(char arreglo[][]){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arreglo[i][j] = '-';    
            }
                 
        }
    }
    
    public static int verificarArreglo(char arreglo[][]){
        int partida = 0;
        for (int i = 0; i < 3; i++) { //CICLO FOR PARA VALIDAR CADA UNA DE LAS CASILLAS DE LAS 'X' Y VER SI GANA
                if (arreglo[i][0] == 'x' && arreglo[i][1] == 'x' && arreglo[i][2] == 'x' ) { // IF CHECA TODAS LAS FILAS
                    
                    partida = GANA; //ASIGNAMOS VALOR A PARTIDA PARA ACABAR EL CICLO
                    
                } else if (arreglo[i][0] == '0' && arreglo[i][1] == '0' && arreglo[i][2] == '0') {
                partida = PIERDE;
            }
                if (arreglo[0][i] == 'x' && arreglo[1][i] == 'x' && arreglo[2][i] == 'x' ) { //IF CHECA TODAS LAS COLUMNAS
                    
                    partida = GANA;
                    
                }else if (arreglo[0][i] == '0' && arreglo[1][i] == '0' && arreglo[2][i] == '0' ) {
                partida = PIERDE;
            }
                if (arreglo[0][0] == 'x' && arreglo[1][1] == 'x' && arreglo[2][2] == 'x' ) {
                    
                    partida = GANA;                                                     //CHECAN DIAGONALES
                    
                } else if (arreglo[0][0] == '0' && arreglo[1][1] == '0' && arreglo[2][2] == '0') {
                partida = PIERDE;
            }
                if (arreglo[0][2] == 'x' && arreglo[1][1] == 'x' && arreglo[2][0] == 'x' ) {
                    
                   partida = GANA;
                   
                } else if (arreglo[0][2] == '0' && arreglo[1][1] == '0' && arreglo[2][0] == '0') {
                partida = PIERDE;
            }
            }
        return partida;
    }
    
     
}