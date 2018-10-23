/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

import java.util.Scanner;

/**
 *
 * @author reza
 */
public class pbo1 {
      public static void main(String[] args) {
        int pilihan= 0;
        Scanner xy= new Scanner (System.in);
        
        while( pilihan != 3 ){
            System.out.println("1. Input Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Keluar");
            System.out.print("Pilihan Anda : "); pilihan=xy.nextInt();
        }
    }
}

    
