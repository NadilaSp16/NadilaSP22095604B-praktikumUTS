/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts;

/**
 *
 * @author Nadila Suci P
 */
public class no1 {
    public static void main(String[] args) {
        
        String[] namaBulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", 
                              "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        
      
        for (int i = 1; i <= 12; i++) {
            System.out.println("Bulan " + i + " adalah " + namaBulan[i - 1]);
        }
    }
}
