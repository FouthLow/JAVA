/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab.pkg6;

import javax.swing.JOptionPane;

public class BAB6 {
    
    public static void main(String[] args) {
        //If Else If
        String temp = JOptionPane.showInputDialog(null, "Masukan Angka", "Menentukan Ganjil Genap", JOptionPane.QUESTION_MESSAGE);
        int input = Integer.parseInt(temp);
        System.out.println((input % 2));
        if ((input % 2) == 0) {
            JOptionPane.showMessageDialog(null, "Angka : " + input + " " + "adalah bilangan Genap", "Informasi", JOptionPane.INFORMATION_MESSAGE);           
        } else if ((input % 2) == 1) {
            JOptionPane.showMessageDialog(null, "Angka : " + input + " " + "adalah bilangan Ganjil", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
        //If Else
        String umur = JOptionPane.showInputDialog(null, "Kamu umur berapa ? ");
        
        if (Integer.parseInt(umur) <= 5) {
            JOptionPane.showMessageDialog(null, "Balita");
        } else if (Integer.parseInt(umur) >= 6 && Integer.parseInt(umur) <= 11) {
            JOptionPane.showMessageDialog(null, "Anak - anak");
        } else if (Integer.parseInt(umur) >= 12 && Integer.parseInt(umur) <= 25) {
            JOptionPane.showMessageDialog(null, "Remaja");
        } else {
            JOptionPane.showMessageDialog(null, "Dewasa");
        }
        
        //Switch Case
        String nilai = JOptionPane.showInputDialog(null, "masukan nilai : ");
        switch (nilai.toUpperCase()) {
            case "A" :
                JOptionPane.showMessageDialog(null, "Sangat baik.");
                break;
            case "B" :
                JOptionPane.showMessageDialog(null, "Baik.");
                break;
            case "C" :
                JOptionPane.showMessageDialog(null, "Cukup.");
                break;
            case "D" :
                JOptionPane.showMessageDialog(null, "Jelek.");
                break;  
            default :
                JOptionPane.showMessageDialog(null, "Salah memsaukan nilai !");
        }
    }
    
}
