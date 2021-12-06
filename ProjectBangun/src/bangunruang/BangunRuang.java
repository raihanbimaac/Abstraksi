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
public abstract class BangunRuang {
    public abstract double hitungVolume();
    public abstract double hitungLuasPermukaan();
    public void tampilHasil(){
        System.out.println("Luas Permukaanya:"  + this.hitungLuasPermukaan());
        System.out.println("Volumenya:"  + this.hitungVolume());
    }
}
