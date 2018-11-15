package com.example.jeanramos.cresspo_app.models;

import java.util.ArrayList;

public class Product {
    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static ArrayList<String> getProductsAsString() {
        ArrayList<String> o = new ArrayList<>();
        o.add("Camisas");
        o.add("Panatalones");
        o.add("Polos");
        o.add("Casacas");
        o.add("Medias");
        o.add("Otros");

        return o;
    }

}
