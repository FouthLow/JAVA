/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PengenalanClass;



public class Hewan {
   
    public String jenisKelamin;
    public int umur;
    public String warnaBulu;
    
   
    //constructor default
    public Hewan() { 
    }
    
    //constructor dengan parameter
    
    public Hewan(String jenisKelamin, int umur, String warnaBulu){
        this.jenisKelamin = jenisKelamin;
        this.umur = umur;
        this.warnaBulu = warnaBulu;
    }
    
    public String melompat(String parameter) {
        
        String perilaku = "Anjing melompati " + parameter + ".";
        return perilaku;
    }
    
    public void memakan(String parameter) {
        
        System.out.println("Anjing Sedang memakan " + parameter + ".");
    }
}
