/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.SewaKOS.model;

/**
 *
 * @author Lenovo
 */
public class Kamar {
    private Penyewa sewa;
    private String nokamar,kapasitas,tglmasuk;
    
    public Kamar(String nkmr,String kpsts,String tglmsk,Penyewa s){
        
        nokamar = nkmr;
        kapasitas = kpsts;
        tglmasuk = tglmsk;
        sewa = s;
    }

    public Penyewa getSewa() {
        return sewa;
    }

    public void setSewa(Penyewa sewa) {
        this.sewa = sewa;
    }

    public String getNokamar() {
        return nokamar;
    }

    public void setNokamar(String nokamar) {
        this.nokamar = nokamar;
    }

    public String getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(String kapasitas) {
        this.kapasitas = kapasitas;
    }

    public String getTglmasuk() {
        return tglmasuk;
    }

    public void setTglmasuk(String tglmasuk) {
        this.tglmasuk = tglmasuk;
    }
    
    public void infoKamar(){
        System.out.println("\nINFO KAMAR");
        System.out.println("No kamar      :"+nokamar);
        System.out.println("Kapasitas     :"+kapasitas);
        System.out.println("Tanggal masuk :"+tglmasuk);
        sewa.infoPenyewa();
    }
}
