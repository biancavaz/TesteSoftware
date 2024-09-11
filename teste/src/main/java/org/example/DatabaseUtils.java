package org.example;

public class DatabaseUtils {

    private boolean connected = false;

    public void connect () {
        connected = true;
        System.out.println("Conectou ao banco de dados");
    }

    public void disconect () {
        connected = false;
        System.out.println("Desconectado do banco de dados");
    }

    public boolean isConnected() {
        return connected;
    }
}
