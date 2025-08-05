/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab.pkg4;

/**
 *
 * @author PC 30 - LAB R1
 */
public class BAB4 {

    //variable java
        public static String variabel1;
        public static String variabel2;
        public static int var1, var2, var3;
        public static String Var1, Var2, Var3;

        public static void main(String[] args){
           //variable
            System.out.println("variabel1 -> " + variabel1);
            System.out.println("variabel2 -> " + variabel2);
            
           //variablemulti
           System.out.println("multi deklarasi -> " + "" +var1);
           System.out.println("multi deklarasi -> " + "" +var2);
           System.out.println("multi deklarasi -> " + "" +var3); 
           
          //deklarasivariable
          System.out.println("variable1 -> " + variabel1);
          System.out.println("variable2 -> " + variabel2);
          System.out.println("setelah diisi :");
          variabel1 = "Hello";
          variabel2 = "Word";
          System.out.println("variabel1 -> " + variabel1);
          System.out.println("variabel2 -> " + variabel2);
          
          //konversi
          String Var1 = "1234567890";
          String Var2 = "3.14";
          String Var3 = "1";
          
          int bulat = Integer.parseInt(Var1);
          double pecahan = Double.parseDouble(Var2);
          short bulat2 = Short.parseShort(Var3);
          
          System.out.println("variabel var1 " + Var1);
          System.out.println("variabel var2 " + Var2);
          System.out.println("variabel var3 " + Var3);
          System.out.println("---");
          System.out.println("konversi bilangan bulat " + bulat);
          System.out.println("konversi bilangan pecahan " + pecahan);
          System.out.println("konversi bilangan bulat2 " + bulat2);
          
          //tipe casting
          int var1 = 5;
          int var2 = 3;
          
          System.out.println("Hasil :"+ (double)var1 / var2);
        }
    }
    

    

