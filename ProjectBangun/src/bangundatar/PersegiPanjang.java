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
public class PersegiPanjang extends BangunDatar {
    public double lebar, panjang;
     
    public double hitungLuas(){
        double luas = lebar * panjang;
        return luas;
    }
    public double hitungKeliling(){
 	  double keliling = 2 * (lebar + panjang);
          return keliling;
    }
}
