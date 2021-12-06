/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author TOSHIBA
 */
public class Tabung extends BangunRuang{
    public double jari, tinggi;
     
    public double hitungLuasPermukaan(){
        double luas = Math.PI * jari * (jari + (2 * tinggi));
        return luas;
    }
    public double hitungVolume(){
 	  double Volume = Math.PI * jari * jari * tinggi;
          return Volume;
    }
}
