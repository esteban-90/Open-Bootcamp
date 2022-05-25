package com.interfaces;

public class Main {
    private static final CocheCRUD cocheCRUD = new CocheCRUDImpl();

    public static void main (String[] args) {
        cocheCRUD.save();
        cocheCRUD.findAll();
        cocheCRUD.delete();
    }
}
