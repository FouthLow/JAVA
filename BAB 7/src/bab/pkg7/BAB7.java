/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab.pkg7;

import javax.swing.JOptionPane;

public class BAB7 {

    
    public static void main(String[] args) {
        //Array Satu Dimensi
        String nama[] = new String[3];
        nama[0] = "Budi";
        nama[1] = "Andi";
        nama[2] = "Dwi";
        
        System.out.println("index 0 : "+nama[0]);
        System.out.println("index 1 : "+nama[1]);
        System.out.println("index 2 : "+nama[2]);
        
        //Array Satu Dimensi JOptionPane
        nama[0] = JOptionPane.showInputDialog(null, "Nama : ","index ke-0", JOptionPane.INFORMATION_MESSAGE);
        nama[1] = JOptionPane.showInputDialog(null, "Nama : ","index ke-1", JOptionPane.INFORMATION_MESSAGE);
        nama[2] = JOptionPane.showInputDialog(null, "Nama : ","index ke-2", JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null, nama[0]+", "+nama[1]+", "+nama[2]);
        
        //Array Multi Dimensi
        String umur[][] = new String[2][2];
        umur[0][0] = "Budi";
        umur[0][1] = "20";
        umur[1][0] = "Andi";
        umur[1][1] = "45";
        
        System.out.println("nama : "+umur[0][0] + " umur : "+umur[0][1]);
        System.out.println("nama : "+umur[1][0] + " umur : "+umur[1][1]);
    }
    
}
