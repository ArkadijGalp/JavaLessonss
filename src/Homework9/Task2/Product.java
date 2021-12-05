package Homework9.Task2;

import java.util.Objects;

public class Product implements Comparable <Product> {

    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "name = " + name + "price = " + price + "\n";
    }
    @Override
    public boolean equals(Object o) {
if (this.price == 0)  return true;
if (this.name == null || getClass() != o.getClass()) return false;
Product product = (Product) o;
return price == product.price && Objects.equals(name, product.name);
    }

    public int Hashcode() {
        return Objects.hash(name,price);
    }

    @Override
    public int compareTo(Product o) {
        return name.compareTo(o.getName());
    }
}