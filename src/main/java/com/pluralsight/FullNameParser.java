package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please input you information: ");
        String userInput = myScanner.nextLine().trim();
        //Uses \\s+ to split multiple white line spaces
        String[] parts = userInput.split(" ");
//        System.out.println(parts[0]);
//        System.out.println(parts[1]);
//        System.out.println(parts[2]);
//        System.out.println(parts[3]);

        String middleName = "(None)";
        String lastName = " ";
        String suffix = "(None)";
        //In the case of "Jose A. Pagan, PhD"
        if (parts.length == 4) {
            middleName = parts[1].trim();
            lastName = parts[2].trim();
            suffix = parts[3].trim();
            int endIndex = lastName.length() - 1;
            lastName = lastName.substring(0, endIndex);
        }
        //In the Case of "Jose Pagan, Sr"
        else if (parts.length == 3) {
            if (parts[1].contains(",")) {
                lastName = parts[1].trim();
                suffix = parts[2].trim();
                int endIndex = lastName.length() - 1;
                lastName = lastName.substring(0, endIndex);
            }
            //In the case of "Jose A. Pagan"
            else {
                lastName = parts[2];
                middleName = parts[1];
            }

        }
        // In the case of "Jose Pagan"
        else {
            lastName = parts[1];
        }

        System.out.println("Your First Name is; " + parts[0]);
        System.out.println("Your Middle Name is; " + middleName);
        System.out.println("Your Last Name is; " + lastName);
        System.out.println("Your Suffix is; " + suffix);


    }
}


