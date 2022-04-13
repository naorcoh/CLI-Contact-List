package edu.naorcoh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactList {
    static Scanner scanner = new Scanner(System.in);

    static String getPhoneNumber() {
        return scanner.nextLine();
    }

    //Use ArrayList data structures to store the contact object
    private List<Contact> contacts;

    public ContactList() {


    }

    public ContactList(ArrayList<Contact> contacts) {
        this.contacts = contacts;
        contacts.add(new Contact("naor", "cohen", "0544433264"));
        contacts.add(new Contact("avi", "miamon", "0544433246"));

    }


    //Method to define the behavior of my contact list class
    //Add Contact
    public boolean addContact(Contact newContact) {
        if (isExist(newContact)) {
            System.out.println("Contact already exist!");
            return false;
        }

        contacts.add(newContact);
        System.out.println("Contact add successfully!");
        return true;

    }


    //Check if contact exist()
    public boolean isExist(Contact contact) {
        return contacts.contains(contact);

    }

    //modify contact
    public boolean modifyContact(Contact contact) {


        int index = getContactIndex(contact);
        IO.modifyMenu();

        int c = scanner.nextInt();



        switch (c) {
            case 1:
                scanner.nextLine();
                System.out.println("Enter First Name");
                contacts.get(index).setFirstName(scanner.nextLine());
                break;

            case 2:
                scanner.nextLine();
                System.out.println("Enter Last Name");
                contacts.get(index).setLastName(scanner.nextLine());
                break;

            case 3:
                scanner.nextLine();
                System.out.println("Enter Phone Number");
                contacts.get(index).setPhoneNumber(scanner.nextLine());
                break;

            case 4:
                scanner.nextLine();
                System.out.println("Enter E-mail");
                contacts.get(index).setEmail(scanner.nextLine());

                break;
            case 5:
                Contact newContact = Main.createContact();
                if (contact.getPhoneNumber().equals(newContact.getPhoneNumber())) {
                    contacts.set(index, newContact);
                    break;
                } else if (isExist(newContact)) {
                    System.out.println("you try to modify phone number used by other contact!" +
                            "\nplease use other number or modify, the relevant contact!");
                    break;
                } else contacts.set(index, newContact);
                break;
            default:
                System.out.println("contact does not modify!");
                return false;
        }


        return true;
    }


    //Get contact index()
    public int getContactIndex(Contact contact) {

        int index = contacts.indexOf(contact);

        return index;
    }


    //Delete contact
    public boolean deleteContact(Contact contact) {
        int index = getContactIndex(contact);

        if (index < 0) {
            System.out.println("Contact not found!");
            return false;
        }

        contacts.remove(index);
        System.out.println("Contact delete successfully!");


        return true;
    }

    //find contact
    public Contact findContact(String phoneNumber) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getPhoneNumber().equals(phoneNumber)) {
                return contacts.get(i);
            }
        }

        throw new NullPointerException();
    }


    public void printContact() {
        System.out.println(this);

    }

    @Override
    public String toString() {
        StringBuilder toString = new StringBuilder("*************************************Contact List*************************************\n\n");

        for (Contact contact : contacts) {
            toString.append(contact.toString()).append("\n\n").append("**************************************************************************************\n\n");


        }
        return toString.toString();
    }
}
