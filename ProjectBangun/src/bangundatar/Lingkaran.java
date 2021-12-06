/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author TOSHIBA
 */
public class Lingkaran extends BangunDatar {
    // atribut jari-jari
    public double jari;
     
    // method untuk hitung luas lingkaran
    public double hitungLuas(){
        double luas = Math.PI * jari * jari;
        return luas;
    }
    
    // method untuk hitung keliling
    public double hitungKeliling(){
 	  double keliling = Math.PI * jari * 2;
          return keliling;
    }
}

