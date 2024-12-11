package com.example.bevasarlas;

public class Product {
    private int id;
    private String name;
    private int quantity;
    private int price;
    private int cat;

    public Product(int id, String name, int quantity, int price, int cat) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.cat = cat;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCat() {
        return cat;
    }

    public void setCat(int cat) {
        this.cat = cat;
    }
}
