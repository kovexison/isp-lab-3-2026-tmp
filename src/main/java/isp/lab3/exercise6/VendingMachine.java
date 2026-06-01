package isp.lab3.exercise6;

public class VendingMachine {
    private static final VendingMachine INSTANCE = new VendingMachine();

    private final String[] productNames = {"Water", "Soda", "Chips"};
    private final int[] productPrices = {3, 5, 4};
    private int credit;

    private VendingMachine() {
    }

    public static VendingMachine getInstance() {
        return INSTANCE;
    }

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
}
