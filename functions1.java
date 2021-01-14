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

    public static void main(String[] args)  {
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        r.nextInt(100);
        System.out.println("Welcome to lotto");
        int rnd1 = getRandomInRange(r, 1, 42);
        float f = s.nextFloat();
        
        // create a function max that gets as parameter int a , int b
        // and return the biggest
        // *etgar: use ? shortcut in the return
        // "catch" the result of the function in int c and print it
        // create a function add that gets as parameter int a , int b
        // and returns a+b
        // "catch" the result of the function in int sum1 and print it
        // do the same for * / - 
    }

}
