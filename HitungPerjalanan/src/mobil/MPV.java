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
public class MPV extends Mobil{
    
    public double jarak, kecepatan;
    
    @Override
    public double hitungBensin() {
        
        double bbmin = jarak / 14;
        return bbmin;
    }

    @Override
    public double hitungWaktuPerjalanan() {
        
        double durasi = jarak / kecepatan;
        return durasi;
    }
}
