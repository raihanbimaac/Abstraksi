/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
import bangundatar.*;
import bangunruang.*;

/**
 *
 * @author TOSHIBA
 */
public class MainClass {
    public static void main(String[] args) {
        Persegi p = new Persegi();
        PersegiPanjang pp = new PersegiPanjang();
        Lingkaran l = new Lingkaran();
        Tabung t = new Tabung();
        Balok blk = new Balok();
        Bola b = new Bola();
        
        p.sisi = 10;
        System.out.println("Persegi dengan nilai sisi: "+ p.sisi + " menghasilkan=");
        p.hitungKeliling();
        p.hitungLuas();
        p.tampilHasil();
        
        pp.panjang = 10;
        pp.lebar = 5;
        System.out.println("\nPersegi Panjang dengan nilai panjang: "+ pp.panjang + " dan lebar: " + pp.lebar + " menghasilkan=");
        pp.hitungKeliling();
        pp.hitungLuas();
        pp.tampilHasil();
        
        l.jari = 10;
        System.out.println("\nLingkaran dengan nilai jari-jari: "+ l.jari + " menghasilkan=");
        l.hitungKeliling();
        l.hitungLuas();
        l.tampilHasil();
        
        t.jari = 10;
        t.tinggi = 10;
        System.out.println("\nTabung dengan nilai jari-jari: "+ t.jari + " dan tinggi: " + t.tinggi + " menghasilkan=");
        t.hitungLuasPermukaan();
        t.hitungVolume();
        t.tampilHasil();
        
        blk.panjang = 15;
        blk.lebar = 10;
        blk.tinggi = 5;
        System.out.println("\nBalok dengan nilai panjang: "+ blk.panjang + " lebar:" + blk.lebar + " dan tinggi: " + blk.tinggi + " menghasilkan=");
        blk.hitungLuasPermukaan();
        blk.hitungVolume();
        blk.tampilHasil();
        
        b.jari = 10;
        System.out.println("\nBola dengan nilai jari-jari: "+ b.jari + " menghasilkan=");
        b.hitungLuasPermukaan();
        b.hitungVolume();
        b.tampilHasil();
    }

}
