package com.ug13.rumahsakit;

import java.io.*;
import java.util.*;

public class Dokter {
    private String nama;
    private String spesialis;
    private String ruangan;



    public Dokter(String nama, String spesialis, String ruangan) {
        this.nama = nama;
        this.spesialis = spesialis;
        this.ruangan = ruangan;
    }

    public void memeriksa(Pasien pasien, Jadwal jadwal){
        if (pasien.getStatus()){
            try {
                FileOutputStream fos = new FileOutputStream("fo");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(pasien);
                oos.close();
                fos.close();
                pasien.setLevelPenyakit(pasien.getLevelPenyakit()-1);
                if (pasien.getLevelPenyakit() >=0){
                    System.out.println("Masih Sakit");
                }
            } catch (IOException i) {
                System.out.println("Error");
            }

            try {
                FileInputStream fis = new FileInputStream("fo");
                ObjectInputStream ois = new ObjectInputStream(fis);

                System.out.println("Screening berhasil");


            } catch (IOException e) {
                System.out.println("Error");
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
    }

    public void cekStatus(Pasien pasien){
        pasien.getStatus();
    }
}