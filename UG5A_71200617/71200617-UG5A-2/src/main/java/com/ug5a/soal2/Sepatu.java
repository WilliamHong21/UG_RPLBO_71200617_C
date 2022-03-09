package com.ug5a.soal2;

public class Sepatu {
    private String kode;
    private int nextNum;
    private String merkModel;
    private int ukuran;
    private long harga;
    private int stok;

    public Sepatu(String argMerkModel, int argUkuran, long argHarga, int argStok){

    }
    public String getKode(){
        return this.kode;
    }
    public String getMerkModel(){
        return this.merkModel;
    }
    public int getUkuran(){
        return this.ukuran;
    }
    public long getHarga(){
        return this.harga;
    }
    public int getStok(){
        return this.stok;
    }

}
