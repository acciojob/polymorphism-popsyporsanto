package com.driver;

public class Main {
    public static class Product{
        public int  Product(int x, int y) {

            return (x*y);
        }
        public int Product(int x, int y, int z) {

            return (x*y*z);
        }
        public double Product(double x, double y) {

            return (x*y);
        }
    }
    public static void main(String[] args) {
        Product p=new Product();
        p.Product(33,44);
        p.Product(93,84,56);
        p.Product(73.5,47.5);

    }
}

