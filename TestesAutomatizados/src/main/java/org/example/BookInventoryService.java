package org.example;

import java.util.HashMap;
import java.util.Map;
public class BookInventoryService {

    private Map<String, Integer> inventory;

    //construtor, vai ser iniciado quando a classe for chamada.
    public BookInventoryService() {
        inventory = new HashMap<>();
        inventory.put("Java Programming", 3);
        inventory.put("Python Fundamentals", 2);
    }

    //se o resultado for maior que 0 vai ser true, senao false
    public boolean isBookAvailable(String title) {
        //retorna se tem no inventário o "valor"(numero) do livro, se o livro não existir ele retorna 0
        return inventory.getOrDefault(title, 0) > 0;
    }


    public void lendBook(String title) {
        // armazenando a quantidade no estoque
        int currentStock = inventory.getOrDefault(title, 0);
        if (currentStock > 0) {
            inventory.put(title, currentStock - 1);
        } else {
            throw new IllegalArgumentException("Livro indisponível para " +
                    "empréstimo: " + title);
        }
    }
}