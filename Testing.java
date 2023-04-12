package com.bridgelabz.userRegistration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Testing{
    @Before
    public  void printBeforeAllMsg() {
        System.out.println("-------Welcome to the User Registration Program-------");
    }
    @After
    public void PrintAfterEachTestCasePass(){
        System.out.println("passed");
    }
    @Test
    public void givenFirstNameShouldBeValid(){
        UserRegistration user = new UserRegistration();
        assertEquals("Valid FirstName", user.checkFirstName("Ramesh"));
        System.out.println("Happy");
    }
    @Test
    public void givenLastNameShouldBeValid(){
        UserRegistration user = new UserRegistration();
        assertEquals("Valid LastName", user.checkLastName("Ambati"));
        System.out.println("Happy");
    }
    @Test
    public void givenEmailShouldBeValid(){
        UserRegistration user = new UserRegistration();
        assertEquals("Valid Email", user.checkEmailId("rameshambati.ab@gmail.com"));
        System.out.println("Happy");
    }
    @Test
    public void givenPhoneNumberShouldBeValid(){
        UserRegistration user = new UserRegistration();
        assertEquals("Valid PhoneNumber", user.phoneNumber("91 9640827483"));
        System.out.println("Happy");
    }
    @Test
    public void givenPasswordShouldBeValid(){
        UserRegistration user = new UserRegistration();
        assertEquals("Valid Password", user.password("Rohitsharma45@"));
        System.out.println("Happy");
    }
}