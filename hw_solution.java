package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main
{

    private static void getFloat(Scanner s) {
        System.out.println("Please enter float:");
        float f = s.nextFloat();
    }
    private static void createRandom(Random r, int min, int max) {
        // 100-250 --> 250-100 == 151 numbers
        // random (max-min) (250-100) (150 + 1) 0-150
        // 0   + 100 (min) = 100
        // 150 + 100 (min) = 250
        int random_number = r.nextInt(max - min + 1) + min;
    }
    // { 0.5, 0.7, 5, -2, 12.5 }
    //   min = -4
    //   max = 0.5
    //  will print: 0.5, -2
    private static void printInRange(double[] arr, double min, double max) {
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] >= min && arr[index] <= max) {
                System.out.println(arr[index]);
            }
        }
    }

    public static void main(String[] args)  {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        getFloat(s);
    }
    private static void printBiggest()  {
        System.out.println("I am the biggest of them all!");
    }
    private static void printBiggest(int a)  {
        System.out.println(String.format("%d is biggest", a));
    }
    private static void printBiggest(int a, int b)  {
        if (a > b) {
            System.out.println(String.format("%d is the biggest", a));
        }
        else {
            System.out.println(String.format("%d is the biggest", b));
        }

        // shortcut
        System.out.println(String.format("%d is the biggest", a > b ? a : b));

        // extra .........
        System.out.println(String.format("%d", b == 0 ? 0 : a / b));
        System.out.println(String.format("%f", b == 0 ? 0.0 : (float)a/b));
        System.out.println(b == 0 ? "Cannot divide by zero" : (float)a/b);
        if (b == 0) {
            System.out.println(0);
        } else {
            System.out.println(a/b);
        }
    }

    private static void printBiggest(int a, int b, int c)
    {
        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > c) {
            System.out.println(b);
        } else
        {
            System.out.println(c);
        }
        System.out.println(String.format("%d is equal-biggest",
                (a > b && a > c) ?  a : b > c ? b : c));
    }

}
