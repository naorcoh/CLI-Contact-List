package edu.naorcoh;

import java.util.*;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static ContactList contactList = new ContactList(new ArrayList<>());


    public static void main(String[] args) {
        // write your code here

        boolean shutdown = false;



        while (!shutdown) {
            IO.contactListMenuOutput();
            int n = scanner.nextInt();
            scanner.nextLine();

            switch (n) {
                case 0:
                    System.out.println("Bye!");
                    shutdown = true;
                    break;
                case 1:
                    addNewContact();
                    break;
                case 2:
                    ModifyOldContact();
                    break;
                case 3:
                    deleteContact();
                    break;
                case 4:
                    findContact();
                    break;
                case 5:
                    printAllContact();
                    break;
                default:
                    System.out.println("invalid number please enter number from 0 - 5");
                    break;
            }
        }

















    }

    //test


    static Contact createContact() {



        IO.initializeOutput("First Name");
        String firstName = scanner.nextLine();



        IO.initializeOutput("Last Name");
        String lastName = scanner.nextLine();


        IO.initializeOutput("Phone Number");
        String phoneNumber = scanner.nextLine();




        IO.initializeOutput("E-mail");
        String email = scanner.nextLine();

        return new Contact(firstName, lastName, phoneNumber, email);

    }
    static void addNewContact() {
        contactList.addContact(createContact());
    }
    static void ModifyOldContact() {

        System.out.println("Please enter the contact phone number you want to modify");
        try {
            Contact contact = contactList.findContact(scanner.nextLine());
            Contact newContact;
            contactList.modifyContact(contact);
        } catch (NullPointerException npe) {
            System.out.println("Phone number does not exist please, use print function to copy the correct number");
        }


    }
    static void printAllContact() {
        contactList.printContact();
    }
    static void deleteContact() {
        System.out.println("Please enter the contact phone number you want to delete:");
        try {
            Contact contact = contactList.findContact(scanner.nextLine());
            contactList.deleteContact(contact);
        }catch (NullPointerException npe) {
            System.out.println("The Phone number does not exist please, use print function to copy the correct number");
        }


    }
    static void findContact() {

        try {
            System.out.println("Please enter the contact phone number you looking for:");
            String phoneNumber = scanner.nextLine();
            System.out.println(contactList.findContact(phoneNumber));
            scanner.nextLine();
        } catch (NullPointerException npe) {
            System.out.println("The Phone number does not exist please, use print function to copy the correct number");

        }

    }





}
