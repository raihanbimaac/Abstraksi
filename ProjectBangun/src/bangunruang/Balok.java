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
public class Balok extends BangunRuang{
    public double panjang, lebar, tinggi;
     
    public double hitungLuasPermukaan(){
        double luas = 2 * ((panjang*lebar)+(lebar*tinggi)+(panjang*tinggi));
        return luas;
    }
    public double hitungVolume(){
 	  double Volume = panjang*lebar*tinggi;
          return Volume;
    }
}
