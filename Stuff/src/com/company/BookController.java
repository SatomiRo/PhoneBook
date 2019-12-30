package com.company;

import java.util.Scanner;

public class BookController {

    private String choice;

    Scanner scan = new Scanner(System.in);
    private BookView theView;
    private BookModel theModel;

    BookController(BookView theView, BookModel theModel) {

        this.theView = theView;
        this.theModel = theModel;

    }

    public void showInterface() {
        theView.displayMenu();
        choice = scan.next();
        switch (choice) {
            case "1":
                theModel.addNewUser();
                showInterface();
                break;
            case "2":
                theView.displayList();
                theModel.getUserList();
                showInterface();
                break;
            case "3":
                theView.displayExit();
                break;
            default:
                theView.displayInvalidInput();
                showInterface();
                break;
        }
    }
}