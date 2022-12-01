package com.bridgelabz;

import java.util.Scanner;

public class UserRegistrationMain extends UserDetailsValidation{
    static Scanner scanner = new Scanner(System.in);
    static String  lastName;

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Problem");
        userLastName();
    }
    public static void userLastName() {
        System.out.println("Enter your Last Name");
        lastName = scanner.next();
        UserDetailsValidation.isValidLastName(lastName);
    }
}
