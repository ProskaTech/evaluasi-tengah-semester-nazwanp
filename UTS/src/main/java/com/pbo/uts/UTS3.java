/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.uts;
import javax.swing.JOptionPane;

/**
 *
 * Created by Nazwa Nurfadhilla Phitri
 */
public class UTS3 {
    public static void main(String [] args) {
        int angka;
        String a;
        
        a = JOptionPane.showInputDialog("Mausukkan Angka");
        angka = Integer.parseInt(a);
        
        if(angka>0) {
            JOptionPane.showMessageDialog(null,"Angka  "+angka+" merupakan bilangan positif" );
        }
        else{
            JOptionPane.showMessageDialog(null,"angka "+angka+" merupakan bilangan negatif");
        }
        
    }
    
}