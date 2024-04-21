/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author Nadila Suci P
 */
import java.util.Scanner;

public class no2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int bilangan;
        int jumlahPositif = 0;
        int jumlahNegatif = 0;
        int total = 0;
        int count = 0;
        
        System.out.print("Masukkan bilangan integer, program akan berhenti jika memasukkan nilai 0: ");
        
        while ((bilangan = scanner.nextInt()) != 0) {
            if (bilangan > 0) {
                jumlahPositif++;
            } else if (bilangan < 0) {
                jumlahNegatif++;
            }
           
            if (bilangan != 0) {
                total += bilangan;
                count++;
            }
        }
        
        scanner.close();
      
        double rataRata = count > 0 ? (double) total / count : 0.0;
        System.out.println("Jumlah bilangan positif adalah " + jumlahPositif);
        System.out.println("Jumlah bilangan negatif adalah " + jumlahNegatif);
        System.out.println("Nilai total adalah " + total);
        System.out.println("Nilai rata-rata adalah " + rataRata);
    }
}      
