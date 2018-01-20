package com.example.akshay.retrofitpro;

/**
 * Created by Akshay on 20-01-2018.
 */

class ResponseStatus {

    String status;
    String message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message+" .";
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
