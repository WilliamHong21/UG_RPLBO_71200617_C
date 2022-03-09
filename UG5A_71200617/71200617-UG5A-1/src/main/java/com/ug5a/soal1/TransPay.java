
package com.ug5a.soal1;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class TransPay
{
    private String nama;
    private long saldo;
    Scanner input = new Scanner(System.in);

    public void setNama(String nama){
        this.nama = nama;
    }
    public void setSaldo(long saldo){
        this.saldo = saldo;
    }
    public String getNama(){
        return this.nama;
    }

    public long getSaldo(){
       return this.saldo;
    }

    public void topUp(long saldo){
        System.out.println();
        if(saldo==0){
            System.out.println("NOMINAL ANDA TIDAK VALID! NOMINAL HARUS LEBIH DARI 0");
        }
        else if(saldo>0){
            saldo = input.next().charAt(0);
            System.out.printf("TOP UP SEBESAR"+saldo+"BERHASIL");
        }
    }
    public void bayar(int jumlah, Keyboard k){
        if(jumlah>0) {
            if(getSaldo()>k.getHarga()) {
                System.out.printf("Pembayaran Sukses! Silakan mengambil" + k.getMerkModel() + "di counter");
            }
            else{
                System.out.println("Pembayaran gagal! Saldo Anda Kurang, silakan melakukan top up!");
            }
        }
        else{
            System.out.println("Input Jumlah tidak valid!");
        }
    }
}
