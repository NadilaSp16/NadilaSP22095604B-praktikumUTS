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

public class no3 {
    public static int sumDigits(long n) {
    n = Math.abs(n); //menghindari hasil negatif
    int sum = 0;
    while (n > 0) {
        sum += n % 10;
        n /= 10;
    }
    return sum;
}

public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("masukan bilangan bulat : ");
    long n = scanner.nextLong();
    int sum = sumDigits(n);
    System.out.println("jumlah nilai yang dikembalikan : " + sum);
}
}