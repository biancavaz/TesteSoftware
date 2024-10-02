package org.example;

import java.util.HashMap;
import java.util.Map;

public class DatabaseService {
    private Map<Integer, String> users;

    //simulando uma "conexão" com o banco de dados
    public void connect(){
        //inicializa um banco de dados simulado na memória
        users = new HashMap<>();
        System.out.println("conexão simulada com o banco de dados estabelecida");
    }


    //simulando uma operação de inserção no banco de dados
    public boolean insertUser(int id, String name){
        if(users.containsKey(id)){
            return false; //simulando falha se o id já existir
        }

        users.put(id,name);
        System.out.println("usuário inserido: ID="+ id + ", nome="+ name);
        return true;
    }


    // simulando uma ação de consulta no banco de dados
    public String findUserById(int id){
        return users.get(id); //retorna o noem de usuário se existir
    }


    //simulando uma "desconexão do banco de dados
    public void disconnect (){
        users = null; // limpa os dados simulados
        System.out.println("conexão simulada com banco de dados encerrada.");
    }
}
