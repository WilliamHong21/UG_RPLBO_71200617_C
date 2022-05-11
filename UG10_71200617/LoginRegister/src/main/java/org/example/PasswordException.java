package org.example;

public class PasswordException extends Exception {
    private String errMessage;
    private int errCode;

    public PasswordException (int errCode) {
        super();
        this.errCode = errCode;
        if (errCode == 1){
            this.errMessage = "Maaf, password tidak boleh kosong!";
        } else if (errCode == 2){
            this.errMessage = "Maaf, password minimal harus terdiri dari 6 karakter";
        } else if (errCode == 3){
            this.errMessage = "Maaf, password harus mengandung minimal 1 karakter huruf kecil, huruf besar, simbol dan angka";
        } else if (errCode == 4){
            this.errMessage = "Maaf, password anda tidak boleh sama dengan username";
        } else if (errCode == 5){
            this.errMessage = "Maaf, password harus sama dengan konfirmasi passowrd";
        }
    }
}
