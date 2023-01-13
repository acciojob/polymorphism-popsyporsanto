package com.driver;

public class Main {
    public static void main(String[] args) {
        product p=new product();
        p.product(33,44);
        p.product(54,62,71);
        p.product(74.67,4989.6875);

    }
}

 class product{
      void product(int x, int y) {
          System.out.println(x+" "+y);
     }
      void product(int x, int y, int z) {
          System.out.println(x+" "+y+" "+z);
     }
     void product(double x, double y) {
         System.out.println(x+" "+y);
     }
}