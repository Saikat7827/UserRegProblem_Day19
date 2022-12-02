package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserDetailsValidation {
    public static void isValidMobileNumber(String mobileNumber) {
       // String regex = "^[91]+[ ]?[6-9]{1}[0-9]{9}$";
        String regex = "[9][1][0-9]{10}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mobileNumber);
        if (matcher.matches()) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
