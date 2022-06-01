package com.ug13.rumahsakit;

import java.io.*;

public class Suster {
    private String nama;

    public Suster(String nama){
        this.nama = nama;
    }

    public void screening(Pasien pasien,Jadwal jadwal){
        if (jadwal.isStatusDaftar()){
            try {
                FileOutputStream fos = new FileOutputStream("screening");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(pasien);
                oos.close();
                fos.close();
            } catch (IOException i) {
                System.out.println("===========================================ANDA HARUS MELAKUKAN PROSES PENDAFTARAN TERLEBIH DAHULU DI BAGIAN PELAYANAN============================================");
            }

            try {
                FileInputStream fis = new FileInputStream("screening");
                ObjectInputStream ois = new ObjectInputStream(fis);

                pasien.equals(ois.readObject());

                jadwal.setStatusScreening(true);

            } catch (Exception e) {
                System.out.println("===========================================ANDA HARUS MELAKUKAN PROSES PENDAFTARAN TERLEBIH DAHULU DI BAGIAN PELAYANAN============================================");
            }
        }

    }
}
