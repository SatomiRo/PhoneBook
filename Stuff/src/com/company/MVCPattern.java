package com.company;

public class MVCPattern {

    //BookView theView = new BookView();

    //BookModel theModel = new BookModel();

    //BookController theController = new BookController(theView, theModel);

    public static void main(String[] args){
        BookModel book = new BookModel();
        BookView view = new BookView();
        BookController con = new BookController(view, book);

        con.showInterface();
    }
}