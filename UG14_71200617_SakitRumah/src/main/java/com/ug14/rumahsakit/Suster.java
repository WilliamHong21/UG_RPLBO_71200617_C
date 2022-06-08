package com.ug14.rumahsakit;

public class Suster {
    private int idSuster;
    private String nama;

    public Suster(String nama) {
        this.nama = nama;
    }

    public void screening(Pasien pasien, Jadwal jadwal) {
        if (jadwal.isStatusDaftar()) {
            jadwal.setStatusScreening(true);
        } else {
            System.out.println("Anda harus mendaftar terlebih dahulu");
        }
    }

    public int getIdSuster() {
        return idSuster;
    }
}