package Homework9.Task2;


import Homework9.Task2.Exceptions.NoKeyInCollectionException;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Banana", 1);
        Shop WholesaleShop = new Shop();
        WholesaleShop.addProduct(2, "Mango", 5);
        WholesaleShop.addProduct(3, "Orange", 3);
        WholesaleShop.addProduct(4, "Strawberry", 4);
        WholesaleShop.addProduct(5, "Feihua", 7);
        WholesaleShop.addProduct(6, "Grapefruit", 9);
        WholesaleShop.addProduct(7, "Grapes", 3);

        WholesaleShop.deleteProduct(3);
        try {
            WholesaleShop.refreshInfoProduct(5, "abrakadabra", 25);
        } catch (NoKeyInCollectionException e) {
            e.getMessage();
        }
        System.out.println(WholesaleShop.receiveIDProduct(2));

        WholesaleShop.getFullInfoProduct();
        System.out.println("\nSort\n");
        WholesaleShop.getSortedInfoProduct();

    }
}
