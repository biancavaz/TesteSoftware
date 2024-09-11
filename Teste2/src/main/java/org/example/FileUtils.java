package org.example;

public class FileUtils {

    public void openConnection () {
        System.out.println("Conexão com o sistema de arquivos aberta");
    }

    public void closeConnection () {
        System.out.println("Conexão com o sistema de arquivos fechada");
    }

    public String createFile(String fileName) {
        System.out.println("Arquivo " + fileName + " Criado");
        return fileName;
    }

    public boolean deleteFile (String fileName) {
        System.out.println("Arquivo " + fileName + " Deletado");
        return true;
    }
}
