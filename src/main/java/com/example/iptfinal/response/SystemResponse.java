package com.example.iptfinal.response;

public class SystemResponse {
    private boolean flag;

    private String message;

    public SystemResponse(){

    }

    public SystemResponse(boolean flag, String message) {
        this.flag = flag;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
