package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p=new Product();
        p.Product(33,44);
        p.Product(54,62,71);
        p.Product(74.67,4989.6875);

    }
}

 class Product{
      void Product(int x, int y) {

          System.out.println(x+" "+y);
     }
      void Product(int x, int y, int z) {

          System.out.println(x+" "+y+" "+z);
     }
     void Product(double x, double y) {
         System.out.println(x+" "+y);
     }
}