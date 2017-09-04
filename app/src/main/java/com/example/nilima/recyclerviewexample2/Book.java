package com.example.nilima.recyclerviewexample2;

/**
 * Created by nilima on 29/8/17.
 */

public class Book {

    private String title;
    private String author;
    private String price;

    public Book(String title, String author, String price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author1) {
        this.author = author1;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price1) {
        this.price = price1;
    }
}
