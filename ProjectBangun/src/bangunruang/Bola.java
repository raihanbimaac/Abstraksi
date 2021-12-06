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
public class Bola extends BangunRuang{
    public double jari;
     
    public double hitungLuasPermukaan(){
        double luas = 4*Math.PI*jari*jari;
        return luas;
    }
    public double hitungVolume(){
 	  double Volume = (4*Math.PI*jari*jari*jari)/3;
          return Volume;
    }
}
