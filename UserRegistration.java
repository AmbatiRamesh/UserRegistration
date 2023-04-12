package com.bridgelabz.userRegistration;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    Scanner scanner = new Scanner(System.in);
    public static final String VALIDATE_NAME="^[A-Z]+[a-z]{2,}$";
    public static final String EMAIL_ID="^[A-Za-z]{3,}[.-]?[A-Za-z]{2,}[@]{1}[a-z]{2,}[.]{1}[a-z]{2,}$";
    public static final String PHONE_NUMBER="^[0-9]+\s[0-9]{10}$";
    public static final String PASSWORD="^[A-Z]+[a-z0-9]{7,}[!@#$%&*]+$";
    public String checkFirstName(String firstName)  {
        if (Pattern.matches(VALIDATE_NAME, firstName))
            return "Valid FirstName";
        else
            return "Invalid FirstName , Please Enter Valid FirstName";
    }

    public String checkLastName(String lastName)  {
        if (Pattern.matches(VALIDATE_NAME,lastName))
            return "Valid LastName";
        else
            return "Invalid Last Name , Please Enter Valid LastName";
    }

    public String checkEmailId(String emailId) {
        if (Pattern.matches(EMAIL_ID,emailId))
            return "Valid Email";
        else
           return  "Invalid Email ID, Please Enter Valid Email ID";
    }

    public String phoneNumber(String phoneNumber) {
        if (Pattern.matches(PHONE_NUMBER,phoneNumber))
            return "Valid PhoneNumber";
        else
           return  "Invalid PhoneNumber, Please Enter Valid PhoneNumber";
    }

    public String password(String password) {
        if (Pattern.matches(PASSWORD,password))
            return "Valid Password";
        else
           return  "Invalid Password, Please Enter Valid Password";
    }
}