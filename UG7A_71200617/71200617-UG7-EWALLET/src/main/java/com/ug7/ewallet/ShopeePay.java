package com.ug7.ewallet;

public class ShopeePay extends eWallet{
    private static int feeTopup=500;
    private static int feeTransfer=0;
    private static int feeWithdraw=1000;

    public ShopeePay(User user) {
        super(user);
    }
    public void topup(int jumlah){
        if (jumlah+this.feeTopup>super.getUser().getUang()){
            jumlah += this.feeTransfer;
            System.out.println("Maaf, uang cash kamu tidak mencukupi! (" + Main.formatRupiah(this.getSaldo() - jumlah) + ")");
        }else{
            super.topup(jumlah);
            super.getUser().topup(jumlah+this.feeTopup);
            System.out.println("Halo, "+super.getUser().getNama()+"! Top up saldo sebesar "+Main.formatRupiah(jumlah)+" berhasil!");
        }
    }
    public void transfer(eWallet eWallet, int jumlah){
        if (super.getUser().isConfirmed()){
            System.out.println("Transfer saldo akan terkena potongan fee " + Main.formatRupiah(this.feeTransfer));
            System.out.print("Transfer sedang diproses");
            Main.tunggu(3);
            if (jumlah+this.feeTransfer>super.getSaldo()){
                jumlah += this.feeTransfer;
                System.out.println("Maaf, saldo kamu tidak mencukupi! (" + Main.formatRupiah(this.getSaldo() - jumlah) + ")");
            }else{
                super.transfer(eWallet,jumlah);
                super.setSaldo(super.getSaldo()-(jumlah+this.feeTransfer));
                System.out.println("Transfer saldo sejumlah "+Main.formatRupiah(jumlah)+" ke akun "+eWallet.getUser().getNama()+" berhasil!");
            }
        }else{
            System.out.println("Halo, " + this.getUser().getNama() + "! Silakan konfirmasi email terlebih dahulu!");
        }
    }
    public void withdraw(int jumlah){
        System.out.println("Withdraw saldo akan terkena potongan fee " + Main.formatRupiah(this.feeWithdraw));
        if (jumlah+this.feeWithdraw>super.getSaldo()){
            jumlah += this.feeWithdraw;
            System.out.println("Maaf, saldo kamu tidak mencukupi! (" + Main.formatRupiah(this.getSaldo() - jumlah) + ")");
        }else{
            super.setSaldo(super.getSaldo()-this.feeWithdraw);
            super.withdraw(jumlah);
            System.out.println("Halo, "+super.getUser().getNama()+"! Uang cash sejumlah "+Main.formatRupiah(jumlah)+" telah masuk ke dompetmu!");
        }
    }
    public void getInfo(){
        System.out.println("[ShopeePay e-Wallet]");
        System.out.println("Nama: "+super.getUser().getNama()+"[PIN: "+super.getUser().getPIN()+" ]");
        System.out.print("Email: "+super.getUser().getEmail());
        if (super.getUser().isConfirmed()){
            System.out.println("[Confirmed]");
        }else{
            System.out.println();
        }
        System.out.println("Uang Cash: "+Main.formatRupiah(super.getUser().getUang()));
        System.out.println("Saldo e-wallet: "+Main.formatRupiah(super.getSaldo()));
        System.out.println();

    }
}