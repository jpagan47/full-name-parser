package com.pluralsight;

public class FullNameParser {
    public static void main(String[] args) {
        String userInput ="Dana L. Wyatt, Jr";
        //Uses \\s+ to split multiple white line spaces
        String[] parts = userInput.split(" ");
        System.out.println(parts[0]);
        System.out.println(parts[1]);
        System.out.println(parts[2]);
        System.out.println(parts[3]);

        String middleName = "(None)";
        String lastName;
        String suffix = "(None)";
        if (parts.length == 4){
            middleName = parts[1];
            lastName = parts[2];
            suffix = parts[3];
        } else {
            lastName = parts[1];
        }
        System.out.println("Your First Name is; " + parts[0]);
        System.out.println("Your Middle Name is; " + middleName);
        System.out.println("Your Last Name is; " + lastName);
        System.out.println("Your Suffix is; " + suffix );


    }
}


