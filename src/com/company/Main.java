package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        // Practice with Arrays
//
//        //1. Create an array that holds numbers 1-10;
//
        Scanner input = new Scanner(System.in);
//
//        int[] anIntegerArray = new int[10];
//        int sum = 0;
//
//        //2. Loop through array and sum total display
//        for (int i = 1; i <= 10; i++) {
//            sum += i;
//        }
//        System.out.println("Total:" + sum);
//
//
//        //3. Array that holds 10 number inputs from user and prints total
//
//        int total =0;
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("Enter any integer");
//            int userInput = input.nextInt();
//            total += userInput;
//        }
//        System.out.println("Total:" + total);

        //4. Get 10 number inputs from user, store in array and get avg of those 10 numbers
        int Input = 0;
        int total = 0;
        System.out.println("Enter a number");
        int arrayInput [] = new int [10];
        for (int i = 1; i <= 10; i++) {
            arrayInput[i] = input.nextInt();
        }
        for (int i = 1; i<= 10; i++) {
            System.out.println("Values are: " + arrayInput[i]);
        }

        System.out.println("Average: " + Input / 10);
    }
//https://codereview.stackexchange.com/questions/58830/printing-the-sums-of-numbers-from-1-to-10-with-only-1-loop
        }
