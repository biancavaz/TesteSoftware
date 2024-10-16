package org.example;

public class Login {
    private String username;
    private int password;

    public Login(String username, int password) {
        this.username = username;
        this.password = password;
    }

    public boolean nome(String username) {
        return username != null && username.equals(this.username);
    }

    public boolean senha(int password) {
        return password == this.password;
    }
}
