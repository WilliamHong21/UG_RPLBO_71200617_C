package org.example;

public class EmailException extends Exception {
    private String errMessage;
    private int errCode;

    public EmailException (int errCode){
        super();
        this.errCode = errCode;
        if (errCode == 1){
            this.errMessage = "Maaf, email anda tidak boleh kosong";
        } else if (errCode == 2){
            this.errMessage = "Maaf, email anda tidak valid";
        }
    }
}
