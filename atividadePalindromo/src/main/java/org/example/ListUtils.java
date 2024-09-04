package org.example;
import java.util.List;

public class ListUtils {

    public void addToList ( List<String> lista, String item) {
        lista.add(item);
    }

    public void removeToList ( List<String> lista, String item){
        lista.remove(item);
    }

    public boolean findToList ( List<String> lista, String item) {
        return lista.contains(item);
    }

}
