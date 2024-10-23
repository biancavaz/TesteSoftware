package org.example.Excecao;

// QUESTÃO 6

import java.io.*;

public class FileLoader {
    public String loadFile(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        if (!file.exists()) {
            throw new FileNotFoundException("Arquivo não encontrado");
        }
        return "Arquivo carregado";
    }
}