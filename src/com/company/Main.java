package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println("The number in even");
        } else {
            System.out.println("The number is odd");
        }
    }
}