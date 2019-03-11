package com.PatternVerification;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternVerification {
    public static final String VALID_FULL_NAME = "^[^\\-]+([A-z\\-]*(\\s))+[A-z\\-]*$";
    public static final String VALID_PHONE_NUMBER = "\\+380\\d{2}\\d{7}";
    public static final String VALID_EMAIL_ADDRESS = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,6}$";

    public static void main (String[] args){
        Scanner fullName = new Scanner(System.in);
        System.out.println("Please enter your full name and press Enter");
        String enteredFullName = fullName.next();
        Scanner phoneNumber = new Scanner(System.in);
        System.out.println("Please enter your phone number and press Enter");
        String enteredPhoneNumber = phoneNumber.next();
        Scanner emailAddress = new Scanner(System.in);
        System.out.println("Please enter your e-mail address");
        String enteredEmailAddress = emailAddress.next();
        validateFullName (enteredFullName);
        validatePhoneNumber(enteredPhoneNumber);
        validateEmailAddress(enteredEmailAddress);

        }

    public static Pattern patternForFullName = Pattern.compile(VALID_FULL_NAME);
    public static boolean validateFullName(String enteredFullName){
        Matcher correctFullName = patternForFullName.matcher(enteredFullName);
        if (correctFullName.find()) {
            System.out.println ("You entered valid full name");
        }
        else {
            String[] invalidSymbolsForFullName = patternForFullName.split(enteredFullName);
            System.out.println("You entered invalid full name using following symbols" + " " + invalidSymbolsForFullName);

        }
        return correctFullName.find();

    }



    public static Pattern patternPhoneNumber = Pattern.compile(VALID_PHONE_NUMBER);
    public static boolean validatePhoneNumber (String enteredPhoneNumber){
        Matcher correctPhoneNumber = patternPhoneNumber.matcher(enteredPhoneNumber);
        if (correctPhoneNumber.find()) {
            System.out.println("You entered valid phone number");
        }

        else {
            String [] invalidSymbolsForPhoneNumber = patternPhoneNumber.split(enteredPhoneNumber);
            System.out.println("You entered invalid phone number using following symbols" + " " + invalidSymbolsForPhoneNumber);
        }
        return correctPhoneNumber.find();
    }

    public static Pattern patternEmailAddress = Pattern.compile(VALID_EMAIL_ADDRESS);
    public static boolean validateEmailAddress (String enteredEmailAddress){
        Matcher correctEmailAddress = patternEmailAddress.matcher(enteredEmailAddress);
        if (correctEmailAddress.find()) {
            System.out.println("You entered valid e-mail address");
        }
        else {
            String[] invalidSymbolsForEmailAddress = patternEmailAddress.split(enteredEmailAddress);
            System.out.println("You entered invalid e-mail address using following symbols" + " " + invalidSymbolsForEmailAddress);
        }
        return correctEmailAddress.find();
    }

}
