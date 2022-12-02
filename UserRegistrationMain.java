package com.bridgelabz;

import java.util.Scanner;

public class UserRegistrationMain extends UserDetailsValidation {
    static Scanner scanner = new Scanner(System.in);
    static String email;

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Problem");
        userEmail();
    }
        public static void userEmail () {
            System.out.println("Enter your Email");
            email = scanner.next();
            UserDetailsValidation.isValidEmail(email);
        }
    }

