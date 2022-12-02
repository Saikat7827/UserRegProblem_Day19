package com.bridgelabz;

import java.util.Scanner;

public class UserRegistrationMain extends UserDetailsValidation {
    static Scanner scanner = new Scanner(System.in);static String mobileNumber;

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Problem");
        userMobileNumber();
    }
    public static void userMobileNumber() {
        System.out.println("Enter your mobile Number");
        mobileNumber = scanner.nextLine();
        UserDetailsValidation.isValidMobileNumber(mobileNumber);
    }
    }

