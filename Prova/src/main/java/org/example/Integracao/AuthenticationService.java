package org.example.Integracao;

// QUESTAO 9
public class AuthenticationService {

    public boolean authenticate(String username, String password){

        if(!username.equals("admin") || !password.equals("admin")) return false;
        return true;
    }

}
