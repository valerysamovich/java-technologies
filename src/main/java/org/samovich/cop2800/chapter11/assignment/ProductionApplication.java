package org.samovich.cop2800.chapter11.assignment;

import java.util.Scanner;

/**
 * Filename ManufacturedPart.java
 * Created on 3/2014 by R Grant
 * Updated on 6/25/2016 by Valery Samovich
 */
public class ProductionApplication {
    /**
     * Main method.
     * @param args
     */
    public static void main(String [] args) {
        // declare fields, objects
        Scanner scan = new Scanner(System.in);
        Part[] parts = new Part[10];
        int userChoice = 0;
        int i = 0;

        // loop over user inputs to fill array
        while (userChoice != 5 && i < parts.length) {
            userChoice = getUserChoice();
            // accept user input. if choice equal 2
            if (userChoice == 1) {
                System.out.print("Enter the part ID: ");
                int partId = scan.nextInt();
                scan.nextLine();
                System.out.print("Enter the part description: ");
                String partDescription = scan.nextLine();
                System.out.print("Enter the part sell price: ");
                double partSellPrice = scan.nextDouble();
                System.out.print("Enter the purchase price: ");
                double purchasePrice = scan.nextDouble();
                scan.nextLine();
                System.out.print("Enter the vendor: ");
                String vendor = scan.nextLine();
                System.out.print("Enter the handling cost: ");
                double handlingCost = scan.nextDouble();
                // create Purchased Part object with user input
                parts[i] = new PurchasedPart(
                        partId,
                        partDescription,
                        partSellPrice,
                        purchasePrice,
                        vendor,
                        handlingCost);
            }
            // accept user input. if choice equal 2
            if (userChoice == 2) {
                System.out.print("Enter the part ID: ");
                int partId = scan.nextInt();
                scan.nextLine();
                System.out.print("Enter the part description: ");
                String partDescription = scan.nextLine();
                System.out.print("Enter the part sell price: ");
                double partSellPrice = scan.nextDouble();
                System.out.print("Enter the labor cost: ");
                double laborCost = scan.nextDouble();
                System.out.print("Enter the material cost: ");
                double materialCost = scan.nextDouble();
                // create Manufactured Part object with user input
                parts[i] = new ManufacturedPart(
                        partId,
                        partDescription,
                        partSellPrice,
                        laborCost,
                        materialCost);
            }
            // accept user input. if choice equal 3
            if (userChoice == 3) {
                System.out.print("Enter the part ID: ");
                int partId = scan.nextInt();
                scan.nextLine();
                System.out.print("Enter the part description: ");
                String partDescription = scan.nextLine();
                System.out.print("Enter the part sell price: ");
                double partSellPrice = scan.nextDouble();
                System.out.print("Enter the labor cost: ");
                double laborCost = scan.nextDouble();
                System.out.print("Enter the material cost: ");
                double materialCost = scan.nextDouble();
                scan.nextLine();
                System.out.print("Enter the subcontract process description: ");
                String subcontractProcessDescription = scan.nextLine();
                System.out.print("Enter the subcontract cost: ");
                double subcontractCost = scan.nextDouble();
                // create Subcontracted Part object with user input
                parts[i] = new SubcontractedPart(
                        partId,
                        partDescription,
                        partSellPrice,
                        laborCost,
                        materialCost,
                        subcontractProcessDescription,
                        subcontractCost);
            }
            // accept user input. if choice equal 4
            if (userChoice == 4) {
                break;
            }
            i++;
        }

        // loop over user inputs, if array is full
        while(i == 10) {
            // display that array is full
            System.out.println("The array is full");
            userChoice = getUserChoice();
            // accept user input. if choice equal 4
            if (userChoice == 4) {
                break;
            }
        }

        // loop over objects and display information
        for (i = 0; i < parts.length; ++i) {
            if (parts[i] instanceof PurchasedPart) {
                printPartInformation(parts[i]);
            }
            // TODO: add check for specific object
            if (parts[i] instanceof ManufacturedPart
                    && !(parts[i] instanceof SubcontractedPart)) {
                printPartInformation(parts[i]);
            }
            if (parts[i] instanceof SubcontractedPart) {
                printPartInformation(parts[i]);
            }
        }
    }

    /**
     * Print part information
     * @param part
     */
    public static void printPartInformation(Part part) {
        System.out.println("********");
        System.out.println(part.toString());
        System.out.println("The product cost is " + part.getProductCost());
    }

    /**
     * Get user input.
     * @return
     */
    public static int getUserChoice() {
        Scanner scan = new Scanner(System.in);
        int userResponse = 0;
        do {
            System.out.println("Enter your choice: ");
            System.out.println("1. Create Purchased Part");
            System.out.println("2. Create Manufactured Part");
            System.out.println("3. Create Subcontracted part");
            System.out.println("4. Exit");
            userResponse = scan.nextInt();
        } while (userResponse < 1 || userResponse > 4);
        return userResponse;
    }
}
