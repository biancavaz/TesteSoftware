package org.example;

public class LibraryService {

    // instanciando a classe
    private BookInventoryService bookInventoryService;

    //construtor
    public LibraryService(BookInventoryService bookInventoryService) {
        this.bookInventoryService = bookInventoryService;
    }

    // vê se o livro esta disponível
    public boolean lendBookToUser(String title) {
        if (bookInventoryService.isBookAvailable(title)) {
            bookInventoryService.lendBook(title);
            return true;
        }
       throw new IllegalArgumentException("Error: Book is not available");
    }
}