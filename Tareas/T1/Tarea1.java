/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

import java.util.Scanner;

/**
 *
 * @author Eduardo Xoquic
 */
public class Tarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese tamaño de la matriz MxM");
        int n = sc.nextInt();
        
        String [][] matriz = new String [n][n];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                matriz[0][j]="1"; 
                if(j==0||j==n-1){
                    matriz[i][j]="1";
                }else{
                matriz[i][j]=" ";
                }

              
                 matriz[n-1][j]="1";     
            }
        }   
      
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print( matriz[i][j]);       
            }
            System.out.println(" ");
        }


    }

}
