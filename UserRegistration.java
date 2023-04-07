package com.bridgelabz.userRegistration;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {
    Scanner scanner = new Scanner(System.in);
    public void checkFirstName(){
        System.out.println("Enter First Name : ");
        String firstName = scanner.next();
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}");
        Matcher matcher = pattern.matcher(firstName);
        boolean b = matcher.matches();
        if (b){
            System.out.println("First Name is Valid---!!");
        }else {
            System.out.println("First Name is Invalid--!!");
        }
    }
    public void checkLastName(){
        System.out.println("Enter Last Name : ");
        String lastName = scanner.next();
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}");
        Matcher matcher = pattern.matcher(lastName);
        boolean b = matcher.matches();
        if (b){
            System.out.println("Last Name is Valid---!!");
        }else {
            System.out.println("Last Name is Invalid--!!");
        }
    }
    public void checkEmail(){
        System.out.println("Enter Email : ");
        String email = scanner.next();
        Pattern pattern = Pattern.compile("^[a-z]{2,}[.][a-z]{2,}[@][a-z]{2,}[.][a-z]{2,}[.][a-z]{2,}");
        Matcher matcher = pattern.matcher(email);
        boolean b = matcher.matches();
        if (b){
            System.out.println("Email Name is Valid---!!");
        }else {
            System.out.println("Email Name is Invalid--!!");
        }
    }
    public void checkPhoneNumber(){
        System.out.println("Enter PhoneNumber : ");
        String phoneNumber = scanner.next();
        Pattern pattern = Pattern.compile("^[+][1-9]{2}|[0-9]{9}");
        Matcher matcher = pattern.matcher(phoneNumber);
        boolean b = matcher.matches();
        if (b){
            System.out.println("PhoneNumber is Valid---!!");
        }else {
            System.out.println("PhoneNumber is Invalid--!!");
        }
    }
    public void checkPasswordRule_1(){
        System.out.println("Enter PasswordRule_1 : ");
        String rule_1 = scanner.next();
        Pattern pattern = Pattern.compile("[A-Za-z]{8,}");
        Matcher matcher = pattern.matcher(rule_1);
        boolean b = matcher.matches();
        if (b){
            System.out.println("PasswordRule_1 is Valid---!!");
        }else {
            System.out.println("PasswordRule_1 is Invalid--!!");
        }
    }
    public static void main(String[] args) {
        UserRegistration user = new UserRegistration();
        user.checkFirstName();
        user.checkLastName();
        user.checkEmail();
        user.checkPhoneNumber();
        user.checkPasswordRule_1();
    }
}
