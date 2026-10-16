package com.pluralsight;

import java.util.Scanner;

public class pointOfSale {
    public static void main(String[] args) {
        // initiate scanner
        Scanner myScanner = new Scanner(System.in);

        // give user size options
        System.out.println("Pick a sandwich size(1 or 2)");
        System.out.println("1: Regular: base price $5.45");
        System.out.println("2: Large: base price $8.95");

        String input = myScanner.nextLine();
        int sizeNumber = Integer.parseInt(input);

        // user can enter age type
        System.out.println("What is your age range?");
        System.out.println("Student (17 years old or younger)");
        System.out.println("Seniors (65 years old or older)");
        System.out.println("Neither");

        // need to make case-sensitive
        String userAge = myScanner.nextLine().toLowerCase();

        System.out.printf("TOTAL: %d%n", sizeNumber);

        myScanner.close();
    }
}
