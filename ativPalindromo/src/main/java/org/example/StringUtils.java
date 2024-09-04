package org.example;

public class StringUtils {

    public boolean isPalindromo (String s){

        if ((s.isEmpty()) || (s == null)) {
            return false;
        }

        //O espaço é caracterizado por "\\".
        String clean = s.replace(" ", "").toLowerCase();
        String reverse = new StringBuilder(clean).reverse().toString();
        return clean.equals(reverse);
    }

    public String reverse (String s){

        if (s == null) {
            return null;
        }
        return new StringBuilder(s).reverse().toString();
    }

    public String toUpperCase (String s){
        if((s.isEmpty()) || (s == null)) {
            return null;
        }

        return s.toUpperCase();
    }

}
