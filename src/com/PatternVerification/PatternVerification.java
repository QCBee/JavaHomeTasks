package com.PatternVerification;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternVerification {
    private static final String VALID_FULL_NAME = "^[^\\-]+([A-z\\-]*(\\s))+[A-z\\-]*$";
    private static final String VALID_FISRT_PHONE_CHARACTERS = "\\+380";
    private static final String VALID_FIRST_CODE_OPERATOR = "[5-9&&[^8]]";
    private static final String VALID_SECOND_CODE_OPERATOR = "[0-9&&[^1-2]&&[^4]]";
    private static final String VALID_LAST_NUMBERS = "[0-9]";
    private static final String VALID_EMAIL_ADDRESS = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,6}$";

    public static void main (String[] args) {
        Scanner fullName = new Scanner(System.in);
        System.out.println("Please enter your full name and press Enter");
        String enteredFullName = fullName.nextLine();
        /*Scanner phoneNumber = new Scanner(System.in);
        System.out.println("Please enter your phone number and press Enter");
        String enteredPhoneNumber = phoneNumber.next();*/
        Scanner emailAddress = new Scanner(System.in);
        System.out.println("Please enter your e-mail address");
        String enteredEmailAddress = emailAddress.next();
        validateFullName(enteredFullName);
        //validateFistCharactersPhoneNumber (enteredPhoneNumber);
        validateEmailAddress(enteredEmailAddress);


//creating the array for future validation of phone number
/*
        int arrayLength = enteredPhoneNumber.length();
        String[] arrayForPhoneNumber = new String[arrayLength];
        for (int i = 0; i < arrayLength - 1; i++) {
            arrayForPhoneNumber[i] = enteredPhoneNumber;
            
        }

    }
*/
//method for validation for full name using elements in constants
    }
    public static Pattern patternForFullName = Pattern.compile(VALID_FULL_NAME);

    public static void validateFullName(String enteredFullName){
        Matcher correctFullName = patternForFullName.matcher(enteredFullName);

        if (correctFullName.find()) {
            System.out.println ("You entered valid full name");
        }
        else {
            String[] invalidSymbolsForFullName = patternForFullName.split(enteredFullName);

            for (String s : invalidSymbolsForFullName) {
                System.out.println("You entered invalid full name using following symbols " + s);
            }
        }
    }

/*
//method for validation for first 3 characters of phone number exp.+380
    public static Pattern patternForFirstCharactersPhoneNumber = Pattern.compile(VALID_FISRT_PHONE_CHARACTERS);

    public static void validatePhoneNumber (String enteredPhoneNumber){
        if (enteredPhoneNumber.startsWith(VALID_FIRST_CODE_OPERATOR)){
        Matcher correctPhoneNumber = patternForFirstCharactersPhoneNumber.matcher(enteredPhoneNumber);

        }
        else {
            String [] invalidSymbolsForPhoneNumber = patternForFirstCharactersPhoneNumber.split(enteredPhoneNumber);
            for (String d: invalidSymbolsForPhoneNumber) {
                System.out.println("You entered invalid phone number using following symbols "  + d);
            }

        }
    }
*/
    public static Pattern patternEmailAddress = Pattern.compile(VALID_EMAIL_ADDRESS);

    public static void validateEmailAddress (String enteredEmailAddress){
        Matcher correctEmailAddress = patternEmailAddress.matcher(enteredEmailAddress);
        if (correctEmailAddress.find()) {
            System.out.println("You entered valid e-mail address");
        }
        else {
            String[] invalidSymbolsForEmailAddress = patternEmailAddress.split(enteredEmailAddress);
            for (String a: invalidSymbolsForEmailAddress) {
                System.out.println("You entered invalid e-mail address using following symbols "  + a);
            }

        }
    }

}
