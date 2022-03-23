package com.ug7.ewallet;

public class eWallet {
    private User user;
    private int saldo;

    public eWallet(User user) {
        this.user = user;
    }
    public void topup(int jumlah){
        this.saldo+=jumlah;
    }
    public void transfer(eWallet eWallet, int jumlah){
        eWallet.saldo+=jumlah;
    }
    public void withdraw(int jumlah){
        this.saldo-=jumlah;
        this.user.setUang(this.user.getUang()+jumlah);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void getInfo(){}

}