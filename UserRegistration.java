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
    public static void main(String[] args) {
        UserRegistration user = new UserRegistration();
        user.checkFirstName();

    }
}
