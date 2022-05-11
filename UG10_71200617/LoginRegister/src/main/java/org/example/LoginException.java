package org.example;

public class LoginException extends Exception {
    private String errMessage;
    private int errCode;

    public LoginException (int errCode){
        super();
        this.errCode = errCode;
        if (errCode == 1){
            this.errMessage = "Maaf, input username tidak boleh kosong";
        } else if (errCode == 2){
            this.errMessage = "Maaf, input password tidak boleh kosong";
        } else if (errCode == 3){
            this.errMessage = "Maaf, username atau password anda salah atau akun anda belum terdaftar";
        }
    }
}