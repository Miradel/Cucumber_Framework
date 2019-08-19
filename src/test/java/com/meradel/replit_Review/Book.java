package com.meradel.replit_Review;

abstract class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}

class MyBook extends Book{
    int price ;
    int[] arr;
    /**
     *   Class Constructor
     *
     *   @param title The book's title.
     *   @param author The book's author.
     *   @param price The book's price.
     **/
    // Write your constructor here
    MyBook(String title, String author,int price,int[] arr2){
        super(title,author);
        super.author = author;
        super.title = title;

        //    super.title = title;
        this.arr = arr2;
        this.price = price;}
    void display(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }

// End class
}
