package org.example;




public class UsernameException extends Exception{
    private String errMessage;
    private int errCode;

    public UsernameException (int errCode){
        super();
        this.errCode = errCode;
        if (errCode == 1){
            this.errMessage =  "Maaf, input username tidak boleh kosong!";
        } else if (errCode == 2){
            this.errMessage = "Maaf. minimal username harus terdiri dari 6 karakter";
        }
    }
}
