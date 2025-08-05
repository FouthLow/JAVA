/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab5;

/**
 *
 * @author PC 30 - LAB R1
 */
public class BAB5 {
    
    
    public static void main(String[] args) {
        //Operator Bilangan Bulat Unary
        Integer sebelum = 20;
        Integer sesudah = 0;
        
        System.out.println("Sebelum Increment : " + sebelum);
        sesudah = ++sebelum;
        System.out.println("Sesudah Increment : " + sesudah);
        //decrenement
        Integer Sebelum = 9;
        Integer Sesudah = 0;
        System.out.println("Sebelum Decrement : " + Sebelum);
        Sesudah = --Sebelum;
        System.out.println("Sesudah Decrement : " + Sesudah);
        //operatornegasi
        int a = 2;
        int b = 0;
        
        System.out.println("Sebelum negasi : " + a);
        b = -a;
        System.out.println("Sebelum negasi :" + b);
        //operator penjumlahan
        
        //penambahan
        int a1 = 10;
        int a2 = 2;
        
        System.out.println("Penambahan 10 + 2 : " + (a1 + a2));
        //pengurangan
        int b1 = 10;
        int b2 = 2;
        
        System.out.println("Pengurangan 10 - 2 : " + (b1 - b2));
        //perkalian
        int c1 = 16;
        int c2 = 2;
        
        System.out.println("Perkalian 16 * 2 : " + (c1 * c2));
        //pembagian
        int d1 = 16;
        int d2 = 2;
        
        System.out.println("Pembagian 16 / 2 : " + (d1 / d2));
        //sisa bagi
        int e1 = 16;
        int e2 = 2;
        
        System.out.println("Sisa bagi 16 dan 2 : " + (e1 % e2));
        //Operator Bilangan Bulat Rasional
        int A = 10;
        int B = 15;
        
        System.out.println("Variabel a : " + A);
        System.out.println("variabel b : " + B);
        System.out.println("Apakah 10 kurang dari 15 " + (A < B));
        System.out.println("Apakah 10 kurang dari 15 " + (B < A));
        System.out.println("Apakah 10 kurang dari 10 " + (B < B));
        //Operataor lebih besar dari
        int q = 2;
        int w = 3;
        System.out.println("variable q :" + q);
        System.out.println("variable w :" + w);
        System.out.println("Apakah 2 lebih besar dari 3 " + (q > w));
        System.out.println("Apakah 3 lebih besar dari 2 " + (w < q));
        System.out.println("Apakah 3 lebih besar dari 3 " + (w < w));
        //Operator Lebih Kecil Atau Sama dengan
        int r = 3;
        int t = 3;
        System.out.println("Variabel r : " + r);
        System.out.println("Variabel t : " + t);
        System.out.println("Apakah 3 lebih kecil atau sama dengan 3 " + (r <= t));
        r = 9;
        System.out.println("variable r diubah :" + r);
        System.out.println("Apakah 9 lebih kecil atau sama dengan 3 " + (r <= t));
        //Operator Lebih Besar Dari Atau Sama Dengan
        int Q = 3;
        int W = 3;
        System.out.println("Variabel Q : " + Q);
        System.out.println("Variabel W : " + W);
        System.out.println("Apakah 3 lebih besar atau sama dengan 3 " + (Q >= W));
        Q = 2;
        System.out.println("Variabel Q diubah : " + Q);
        System.out.println("Apakah 2 lebih besar atau sama dengan 3 " + (Q >= W));
        //Operator sama dengan dan operator tidak sama dengan
        int z = 3;
        int x = 3;
        System.out.println("Variabel z : " + z);
        System.out.println("Variabel x : " + x);
        System.out.println("Apakah 3 sama dengan 3 " + (z == x));
        z = 2;
        System.out.println("Apakah 2 sama dengan 3 " + (z == x));
        System.out.println("Apakah 2 tidak sama dengan 3 " + (z != x));
        //operator boolean
        System.out.println("true and true : " + (true && true));
        System.out.println("true and false : " + (true && false));
        System.out.println("false and false : " + (false && false));
        System.out.println("false and true : " + (false && true));
        
       System.out.println("true or true : " + (true || true));
       System.out.println("true or false : " + (true || false));
       System.out.println("false or false : " + (false || false));
       System.out.println("false or true : " + (false || true));
        
    }
    
}
