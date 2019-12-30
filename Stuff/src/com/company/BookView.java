package com.company;

public class BookView {

    public void displayMenu(){
        System.out.println();
        System.out.println("Input: ");
        System.out.println("1. Save");
        System.out.println("2. List");
        System.out.println("3. Exit");
    }

    public void displayList(){
        System.out.println("List:");
    }

    public void displayExit(){
        System.out.println("Exiting");
    }

    public void displayInvalidInput() {
        System.out.println("Invalid input");
    }
}