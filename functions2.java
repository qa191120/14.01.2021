package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main
{
    // void ==> this functions does not return anything
    // instead void: <type> int, float, String, int[] ....
    //private static void createRandomInRange(Random r, int min, int max) {
      private static int getRandomInRange(Random r, int min, int max) {
        int random_number = r.nextInt(max - min + 1) + min;
        return random_number;

        //return   r.nextInt(max - min + 1) + min;
    }

    private static double add(double a, double b) {
          //double result = a + b;
          //return result;
        return a + b;
    }
    private static double min(double a, double b) {
        return a - b;
    }
    private static double mul(double a, double b) {
        return a * b;
    }
    private static double div(double a, double b) {
          // Double.NaN; // not a number

        return b != 0 ? a / b : Double.NaN;

    }

    private static double getMax(double a, double b) {
          if (a > b) {
              return a; // return breaks out of the function!!
              // ERROR -- unreachable
              // System.out.println("Are you here?");
          }
          else {
              return b; // return breaks out of the function!!
          }
    }

    public static void main(String[] args)  {
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        System.out.println(Double.NaN);
        r.nextInt(100);
        System.out.println("Welcome to lotto");
        double a = 5.78;
        double b = 0;
        getMax(a, b);
        double max = getMax(a, b);
        System.out.println(String.format("%f , %f. bigger is: %f", a, b, getMax(a, b)));

        // create a function max that gets as parameter int a , int b
        // and return the biggest
        // *etgar: use ? shortcut in the return
        // "catch" the result of the function in int c and print it
        // create a function add that gets as parameter int a , int b
        // and returns a+b
        // "catch" the result of the function in int sum1 and print it
        // do the same for * / -
        System.out.println(String.format("%f + %f = %f", a, b, add(a, b)));
        System.out.println(String.format("%f - %f = %f", a, b, min(a, b)));
        System.out.println(String.format("%f * %f = %f", a, b, mul(a, b)));
        System.out.println(String.format("%f / %f = %f", a, b, div(a, b)));

        
    }

}
