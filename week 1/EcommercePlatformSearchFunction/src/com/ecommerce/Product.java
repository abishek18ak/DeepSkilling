package com.ecommerce;


public class Product {

    private int id;
    private String name;
    private String category;
    private double price;


    public Product(int id, String name, String category, double price) {

        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;

    }


    public String getName() {

        return name;

    }


    public String getCategory() {

        return category;

    }


    public double getPrice() {

        return price;

    }


    public void displayProduct(){

        System.out.println(
            id + " | " +
            name + " | " +
            category + " | $" +
            price
        );

    }

}