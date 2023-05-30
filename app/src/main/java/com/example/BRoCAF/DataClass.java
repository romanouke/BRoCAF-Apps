package com.example.BRoCAF;

public class DataClass {
    String username, email, password, repass;

    public DataClass(String username, String email, String password, String repass) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.repass = repass;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepass() {
        return repass;
    }

    public void setRepass(String repass) {
        this.repass = repass;
    }
    public DataClass(){

    }
}
