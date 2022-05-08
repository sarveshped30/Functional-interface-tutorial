package com.bridgelabz.demo;

//FunctionalInterface with Args
interface FunInterface {
    void print3(int a, int b);
}

public class FunctionalObject {
    public static void main(String[] args) {
        // Object for FunInterface
        FunInterface func = (int a, int b) -> {
            System.out.println("*****FunctionalInterface with Args********");
            int c = a+b;
            System.out.println("Sum of " + a + " and " + b +" is: " + c );
        };
        func.print3(10, 6);
    }
}




