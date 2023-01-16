package com.driver;

public class Main {
    public static class product{
        public int  product(int x, int y) {

            return x*y;
        }
        public int product(int x, int y, int z) {

            return x*y*z;
        }
        public double product(double x, double y) {

            return x*y;
        }
    }
    public static void main(String[] args) {
        product p=new product();
        p.product(33,44);
        p.product(93,84,56);
        p.product(73.5,47.5);

    }
}

