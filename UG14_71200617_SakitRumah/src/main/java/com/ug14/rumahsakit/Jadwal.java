package com.ug14.rumahsakit;

public class Jadwal {
    private int idPemeriksaan;
    private Pasien pasien;
    private Dokter dokter;
    private Suster suster;
    private Pelayanan pelayanan;
    private boolean statusDaftar = false;
    private boolean statusScreening = false;

    public Jadwal() {
        this.pasien = pasien;
        this.dokter = dokter;
        this.suster = suster;
        this.pelayanan = pelayanan;
    }

    public boolean isStatusScreening() {
        return statusScreening;
    }

    public int getIdPemeriksaan() {
        return idPemeriksaan;
    }

    public Pasien getPasien() {
        return pasien;
    }

    public Dokter getDokter() {
        return dokter;
    }

    public Suster getSuster() {
        return suster;
    }

    public Pelayanan getPelayanan() {
        return pelayanan;
    }

    public void setPasien(Pasien pasien) {
        this.pasien = pasien;
    }

    public void setDokter(Dokter dokter) {
        this.dokter = dokter;
    }

    public void setSuster(Suster suster) {
        this.suster = suster;
    }

    public void setStatusDaftar(boolean statusDaftar) {
        this.statusDaftar = statusDaftar;
    }

    public boolean isStatusDaftar() {
        return statusDaftar;
    }

    public void setStatusScreening(boolean statusScreening) {
        this.statusScreening = statusScreening;
    }


}