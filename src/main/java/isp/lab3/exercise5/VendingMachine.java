package isp.lab3.exercise5;

import java.util.Scanner;

public class VendingMachine {
    private final String[] productNames = {"Water", "Soda", "Chips"};
    private final int[] productPrices = {3, 5, 4};
    private int credit;

    public void displayProducts() {
        for (int i = 0; i < productNames.length; i++) {
            System.out.println((i + 1) + " - " + productNames[i] + " (" + productPrices[i] + ")");
        }
    }

    public void insertCoin(int value) {
        if (value > 0) {
            credit += value;
        }
    }

    public String selectProduct(int id) {
        if (id < 1 || id > productNames.length) {
            return "Invalid selection";
        }
        int index = id - 1;
        if (credit < productPrices[index]) {
            return "Insufficient credit";
        }
        credit -= productPrices[index];
        return productNames[index];
    }

    public void displayCredit() {
        System.out.println("Current credit: " + credit);
    }

    public void userMenu() {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean running = true;
            while (running) {
                System.out.println("1. Display products");
                System.out.println("2. Insert coin");
                System.out.println("3. Select product");
                System.out.println("4. Display credit");
                System.out.println("0. Exit");
                System.out.print("Choose option: ");
                int option = scanner.nextInt();
                switch (option) {
                    case 1:
                        displayProducts();
                        break;
                    case 2:
                        System.out.print("Insert coin value: ");
                        int value = scanner.nextInt();
                        insertCoin(value);
                        break;
                    case 3:
                        System.out.print("Select product id: ");
                        int id = scanner.nextInt();
                        System.out.println(selectProduct(id));
                        break;
                    case 4:
                        displayCredit();
                        break;
                    case 0:
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid option");
                }
            }
        }
    }
}
