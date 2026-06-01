package isp.lab3.exercise5;

public class MainOfExercise5 {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.displayProducts();
        vendingMachine.insertCoin(5);
        System.out.println(vendingMachine.selectProduct(2));
        vendingMachine.displayCredit();
    }
}
