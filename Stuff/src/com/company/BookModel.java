package com.company;

import java.util.*;

public class BookModel {

    Scanner scan = new Scanner(System.in);
    private TreeMap<String, Long> user = new TreeMap<>();

    //private ArrayList<String> fName = new ArrayList<String>();
    //private ArrayList<Long> number = new ArrayList<Long>();


    public void addNewUser() {
        System.out.println("Input name");
        String firstName = scan.nextLine();

        try {
            System.out.println("Input number");
            long num = Long.parseLong(scan.nextLine());
            user.put(firstName, num);
            System.out.println("Done");
        } catch (NumberFormatException e) {
            System.out.println("Wrong input");
        }
    }
    public void getUserList(){
        user.forEach((String,Long) -> System.out.println(String + " " + Long));
    }

    //public void findUser{}
}