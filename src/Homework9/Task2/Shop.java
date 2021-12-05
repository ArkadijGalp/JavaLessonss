package Homework9.Task2;

import Homework9.Task2.Exceptions.NoKeyInCollectionException;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Shop {

    private String string = "";

    Map<Integer, Product> ProductMap = new HashMap<>();

    void addProduct(int key, String name, int price) {
        ProductMap.put(key, new Product(name, price));
    }

    void deleteProduct(int key) {
        ProductMap.remove(key);
    }

    void refreshInfoProduct(int key, String name, int price) throws NoKeyInCollectionException {
        if (ProductMap.containsKey(key)) {
            ProductMap.put(key, new Product(name, price));
        } else {
            throw new NoKeyInCollectionException("The key is missing ");
        }

    }

    Product receiveIDProduct(int key) {
        return ProductMap.get(key);
    }

    void getFullInfoProduct() {
        for (Map.Entry<Integer, Product> entryMap : ProductMap.entrySet()) {
            System.out.println("Key: " + entryMap.getKey() + "Value :" + entryMap.getValue());
        }
    }

    void getSortedInfoProduct() {
        TreeSet<Product> products = new TreeSet<>();
        System.out.println(products);
    }

    public String toString() {
        for (Map.Entry<Integer, Product> entry : ProductMap.entrySet()) {
            this.string += entry.getKey() + " - " + entry.getValue().toString() + "\n";
        }
        return string;
    }
}