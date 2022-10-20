/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.uts;
import java.util.Scanner;

/**
 *
 * Created by Nazwa Nurfadhilla Phitri
 */
public class UTS2 {
    public static void main(String[] args) {
    int x;
    int y;
    int jml_baris;

    Scanner input = new Scanner(System.in);
    System.out.print("Masukan Jumlah Baris : ");
    jml_baris = input.nextInt();
    
    for (x=1; x<=jml_baris; x++)
    {
        for (y=1; y<=x; y++)
        {
            System.out.print(" ");
        }
            for (y=5; y>=x; y--)
            {
                System.out.print("#");
                System.out.print(" ");
            }
        System.out.println();
    }
    
    for (x=1; x<=jml_baris; x++)
    {
        for (y=5; y>=x; y--)
        {
            System.out.print(" ");
        }
            for (y=1; y<=x; y++)
            {
                System.out.print("*");
                System.out.print(" ");
            }
                System.out.println();
    }

    }
}