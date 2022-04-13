package edu.naorcoh;

import java.util.Objects;

public class Contact {
    //The contact class fields
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;


    //The main constructor initialize all the contact field whit value
    public Contact(String firstName, String lastName, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    //Chaining constructor initialize 3 field with argument and the email field with "empty" string
    public Contact(String firstName, String lastName, String phoneNumber) {
        this(firstName, lastName, phoneNumber, "empty");
    }

    //Getter & Setter
    //First Name
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //Last Name
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //Phone Number
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //E-mail
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    //Override methode
    //toString
    @Override
    public String toString() {
        return "Contact: " + firstName + " " + lastName +
                "\n" + "Phone Number: " + phoneNumber +
                "\n" + "E-mail: " + email;
    }

    //Equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(phoneNumber, contact.phoneNumber);
    }



    //Hash Code
    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber);
    }
}
