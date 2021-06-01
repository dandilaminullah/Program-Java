 */
package com.java.SewaKOS.controller;

import com.java.SewaKOS.model.Kamar;
/**
 *
 * @author Lenovo
 */
public class Petugas {
    
    private String namaP;
    private Kamar[] kamar;
    
    private int index,jumlah;
    
    public Petugas(String p,int k){
        namaP = p;
        jumlah = k;
        kamar = new Kamar[jumlah];
        for(int i = 0;i < kamar.length ;i++){
            kamar[i] = null;
        }
        index = -1; 
    }
    public Kamar tambahKamar(Kamar x){
        index = index +1;
        kamar[index]=x;
        return null;
    }
    
    public Kamar hapusKamar(){
        Kamar temp = kamar[index];
        index = index -1;
        return temp;
    }
    public void bacaKamar(){
        System.out.println("Nama petuga KOS :"+namaP);
        System.out.println("");
        for(int i=0;i<=index;i++){
            kamar[i].infoKamar();
        }
    }
}
