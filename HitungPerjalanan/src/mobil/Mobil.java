/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobil;

/**
 *
 * @author TOSHIBA
 */
public abstract class Mobil {
    
    public abstract double hitungBensin();
    public abstract double hitungWaktuPerjalanan();
    public void tampilHasil() {
        
        System.out.println("Bahan Bakar Minimal yang Diperlukan : " + this.hitungBensin());
        System.out.println("Lama Perjalanan yang Akan Ditempuh : " + this.hitungWaktuPerjalanan());
    }
}