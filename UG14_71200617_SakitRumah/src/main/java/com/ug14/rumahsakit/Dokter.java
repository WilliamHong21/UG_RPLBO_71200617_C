package com.ug14.rumahsakit;

public class Dokter {
    private int idDokter;
    private String nama;
    private String spesialis;
    private String ruangan;

    public Dokter(String nama, String spesialis, String ruangan) {
        this.nama = nama;
        this.spesialis = spesialis;
        this.ruangan = ruangan;
    }

    public void memeriksa(Pasien pasien, Jadwal jadwal) {
        if (!jadwal.isStatusDaftar() || !jadwal.isStatusScreening()) {
            System.out.println("Pasien ilegal");
        } else {
            pasien.setLevelPenyakit(pasien.getLevelPenyakit()-1);
            if (pasien.getLevelPenyakit() == 0) {
                pasien.setStatus(true);
                System.out.println("Pasien sudah sembuh");
            } else {
                System.out.println("Pasien masih sakit");
            }
        }
    }

    public void cekStatus(Pasien pasien) {
        pasien.isStatus();
    }

    public int getIdDokter() {
        return idDokter;
    }
}