package com.ug13.rumahsakit;

import java.io.*;

public class Pasien {
    private String nama;
    private int usia;
    private String alamat;
    private String penyakit;
    private int levelPenyakit = 3;
    private boolean status = false;


    public Pasien(String namaPasien, int usia, String alamat) {
        this.nama = namaPasien;
        this.usia = usia;
        this.alamat = alamat;
    }

    public Pasien(String namaPasien, int usia, String alamat, String penyakit) {
        this.nama = namaPasien;
        this.usia = usia;
        this.alamat = alamat;
        this.penyakit = alamat;
    }

    public int getLevelPenyakit() {
        return levelPenyakit;
    }

    public void setLevelPenyakit(int levelPenyakit) {
        this.levelPenyakit = levelPenyakit;
        if (this.levelPenyakit == 0) {
            this.status = true;
        }
    }

    public boolean getStatus() {
        return status;
    }

}