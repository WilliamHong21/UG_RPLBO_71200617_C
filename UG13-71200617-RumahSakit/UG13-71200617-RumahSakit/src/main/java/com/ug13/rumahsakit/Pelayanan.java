package com.ug13.rumahsakit;

import java.util.*;

public class Pelayanan {
    private String nama;

    public Pelayanan(String nama){
        this.nama = nama;
    }

    public void mengaturJadwal(Pasien pasien, Dokter dokter, Jadwal jadwal){
        jadwal.setPasien(pasien);
        jadwal.setDokter(dokter);
        jadwal.setStatusDaftar(true);
    }

    public Pasien registrasi(){
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nama anda : ");
        String namaPasien = in.nextLine();
        System.out.print("Masukkan usia anda : ");
        int usia = Integer.parseInt(in.nextLine());
        System.out.print("Masukkan alamat anda : ");
        String alamat = in.nextLine();
        System.out.print("Masukkan penyakit anda : ");
        String penyakit = in.nextLine();

        Pasien pasien = new Pasien(namaPasien,usia,alamat,penyakit);
        return pasien;
    }


}