package org.example;

public class Main {
    public static void main(String[] args) {

        BookInventoryService service = new BookInventoryService();

        LibraryService libraryService = new LibraryService(service);

    }
}
