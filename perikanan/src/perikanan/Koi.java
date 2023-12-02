/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perikanan;

/**
 *
 * @author j
 */
public class Koi extends Ikan {
    public Koi(){
        kondisi = "Bersih";
        hari = 1;
        lapar = "Lapar";
    }
    
    public void selesai(){
       hari += 1;
       if(hari % 3 == 0){
           kondisi = "Kotor";
       }
       lapar = "Lapar";
    }
    
    public void makan(){
        lapar = "Kenyang";
    }
    
    public void bersih(){
        kondisi = "Bersih";
    }
}
