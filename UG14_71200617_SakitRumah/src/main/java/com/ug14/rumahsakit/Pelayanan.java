package com.ug14.rumahsakit;

import java.sql.SQLException;
import java.util.Scanner;
public class Pelayanan {
    private int idPelayanan;
    private String nama;

    public Pelayanan(String nama) {
        this.nama = nama;
    }

    public void mengaturJadwal(Pasien pasien,Dokter dokter, Suster suster, Jadwal jadwal) throws SQLException {
        if (!pasien.isStatus()) {
            jadwal.setPasien(pasien);
            jadwal.setDokter(dokter);
            jadwal.setSuster(suster);
            jadwal.setStatusDaftar(true);

            DAO.inputJadwal(jadwal);
        }
    }



    public Pasien registrasi() throws SQLException {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan rm baru : ");
        int rm = Integer.parseInt(in.nextLine());
        System.out.print("Masukkan nama anda : ");
        String nama = in.nextLine();
        System.out.print("Masukkan usia anda : ");
        int usia = Integer.parseInt(in.nextLine());
        System.out.print("Masukkan alamat anda : ");
        String alamat = in.nextLine();
        System.out.print("Masukkan penyakit anda : ");
        String penyakit = in.nextLine();

        Pasien pasien = new Pasien(rm,nama,usia,alamat,penyakit);
        DAO.inputPasien(pasien);
        return pasien;
    }

    public int getIdPelayanan() {
        return idPelayanan;
    }
}