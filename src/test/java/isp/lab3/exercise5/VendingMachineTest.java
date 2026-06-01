package isp.lab3.exercise5;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class VendingMachineTest {
    @Test
    public void testDisplayProducts() {
        VendingMachine vendingMachine = new VendingMachine();
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));
        try {
            vendingMachine.displayProducts();
        } finally {
            System.setOut(originalOut);
        }
        String printed = output.toString();
        assertTrue(printed.contains("1 - Water"));
        assertTrue(printed.contains("2 - Soda"));
        assertTrue(printed.contains("3 - Chips"));
    }

    @Test
    public void testInsertCoinAndSelectProduct() {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.insertCoin(5);
        assertEquals("Soda", vendingMachine.selectProduct(2));
    }

    @Test
    public void testSelectProductInsufficientCredit() {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.insertCoin(2);
        assertEquals("Insufficient credit", vendingMachine.selectProduct(1));
    }

    @Test
    public void testSelectProductInvalidSelection() {
        VendingMachine vendingMachine = new VendingMachine();
        assertEquals("Invalid selection", vendingMachine.selectProduct(0));
        assertEquals("Invalid selection", vendingMachine.selectProduct(10));
    }
}
