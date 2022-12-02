package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserDetailsValidation {
    public static void isValidEmail(String email) {

         String regex = "([a-z]{3,})(.)([a-z]{3,})[@][a-z]{2}(.)([a-z]{2})(.)([a-z]{2})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
