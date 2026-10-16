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
        System.out.println("Select: ");

        String input = myScanner.nextLine();
        int sizeNumber = Integer.parseInt(input);

        // loaded option
        System.out.println("Would you like the sandwich loaded?");
        System.out.println("yes");
        System.out.println("no");
        System.out.println("Select: ");
        String loaded = myScanner.nextLine().toLowerCase();

        double loadedCost = 0;

        if(loaded.equals("yes")){
            System.out.println("Would you like the sandwich loaded regular or large?");
            System.out.println("Regular (+ $1.00)");
            System.out.println("Large (+ $1.75)");
            System.out.println("Select: ");
            String loadedSize = myScanner.nextLine().toLowerCase();

            if(loadedSize.equals("regular")){
                loadedCost += 1.00;
            }
            if(loadedSize.equals("regular")){
                loadedCost += 1.75;
            }
        }


        // user can enter age type
        System.out.println("What is your age range?");
        System.out.println("Student (17 years old or younger)");
        System.out.println("Senior (65 years old or older)");
        System.out.println("Neither");
        System.out.println("Select: ");

        // case-insensitive
        String userAge = myScanner.nextLine().toLowerCase();

        // get the total cost
        double totalCost = 0;

        // the size picked decides which option the statement goes to
        // can use switch case instead
        if (sizeNumber == 1){
            if(userAge.equals("student")){
                totalCost = loadedCost + (5.45 * 0.90);
            }else if(userAge.equals("senior")){
                totalCost = loadedCost + (5.45 * 0.80);
            }else{
                totalCost = 5.45 + loadedCost;
            }
        }else if (sizeNumber == 2){
            if(userAge.equals("student")){
                totalCost = loadedCost + (8.95 * 0.90);
            }else if(userAge.equals("senior")){
                totalCost = loadedCost + (8.95 * 0.80);
            }else{
                totalCost = 8.95 + loadedCost;
            }
        }else{
            System.out.println("Invalid size, try again!");
        }

        System.out.printf("TOTAL: %.2f%n", totalCost);

        myScanner.close();
    }
}
