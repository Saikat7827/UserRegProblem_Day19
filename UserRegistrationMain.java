package com.bridgelabz;

import java.util.Scanner;

public class UserRegistrationMain extends UserDetailsValidation {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Problem");
        userPassword();
    }   
    public static void userPassword() {
        System.out.println("Enter your password");
        String password = scanner.nextLine();
        isValidPassword(password);
    }
    }

