package edu.naorcoh;

import java.util.Scanner;

public class IO {

    public static Scanner scanner = new Scanner(System.in);
    public static void modifyMenu() {
        System.out.println("Which field of the contact you want to modify?" +
                "\nEnter number from 1 - 4:" +
                "\n1 - First Name" +
                "\n2 - Last Name" +
                "\n3 - Phone Number" +
                "\n4 - E-mail" +
                "\n5 - all field" +
                "\nEnter other any key to exit!");






    }
    public static void initializeOutput(String field) {
        System.out.println("Enter Contact " + field + ":");
    }
    public static void contactListMenuOutput() {
        System.out.println("Please enter, number to action:" +
                "\n 0 - Exit" +
                "\n 1 - Add Contact " +
                "\n 2 - Modify Contact " +
                "\n 3 - Delete Contact" +
                "\n 4 - Find Contact" +
                "\n 5 - Print All Contacts" );

    }


}
