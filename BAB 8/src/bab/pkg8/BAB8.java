/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab.pkg8;

import javax.swing.JOptionPane;

public class BAB8 {

    
    
    public static void main(String[] args) {
       //Pengulangan For
       for (int a = 0; a < 10; a++) {
           System.out.println("Halo Dunia");
       }
       //Pengulangan Segitiga
       for (int a = 2; a < 12; a += 2){
           System.out.println("Bilangan Genap : " + a);
       }
       int baris = 5;
               
               for (int i = 0; i <= baris; i++) {
                   for (int j = 0; j < i; j++) {
                       System.out.print("* ");
                   }
                   System.out.println("");
               } 
        //Pengulangan Nama
        int jumlahKelas = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukan jumlah kelas : ", "Input", JOptionPane.INFORMATION_MESSAGE));
        String isiKelas [][] = new String [jumlahKelas][];
        
        for (int kelas = 0; kelas < jumlahKelas; kelas++) {
            String namaKelas = JOptionPane.showInputDialog(null, "Nama Kelas : ", "Masukan Nama Kelas", JOptionPane.INFORMATION_MESSAGE);
            int jumlahKursi = Integer.parseInt(JOptionPane.showInputDialog(null, "Jumlah murid masing - masing kelas : ", "Input", JOptionPane.INFORMATION_MESSAGE));
            isiKelas[kelas] = new String[jumlahKursi];
            System.out.println("Kelas " + namaKelas + " : ");
            for (int kursi = 0; kursi < jumlahKelas; kursi++){
                String namaSiswa = JOptionPane.showInputDialog(null, "nama Siswa ", "Kelas " + namaKelas, JOptionPane.INFORMATION_MESSAGE);
                isiKelas[kelas][kursi] = namaSiswa;
                System.out.println("Nama Siswa " + isiKelas[kelas][kursi]);
            }
        }
        //while
        int arr[] = new int[4];
        boolean hasil = true;
        arr[0] = 2;
        arr[1] = 5;
        arr[2] = 7;
        arr[3] = 1;
        
        while (hasil == true) {
            String input = JOptionPane.showInputDialog(null, "masukan bilagan bulat : ");
            int cekInputan = Integer.parseInt(input);
            for (int a = 0; a < 4; a++) {
                if (cekInputan == arr[a]) {
                    hasil = false;
                    break;
                } else {
                    hasil = true;
                }
            }
            if (hasil == true) {
                JOptionPane.showMessageDialog(null, "Angka " + cekInputan + " tidak ada didalam array.");
            } else {
                JOptionPane.showMessageDialog(null, "Angka " + cekInputan + " ada didalam array.");

            }
        }
        //Do While
        String input = "";
        int cekbil = 0;
        do {
            input = JOptionPane.showInputDialog(null, "4 x 3 :");
            cekbil = Integer.parseInt(input);
        } while (cekbil != 12);
    }
    
}
