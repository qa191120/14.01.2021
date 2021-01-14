package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main
{
    static Scanner s= new Scanner(System.in); // scanner here in parent
    static Random r = new Random();

    private static float getFloat(String msg) {
        System.out.println(msg);
        float f = s.nextFloat(); // scanner here in child automatically
        return f;
    }
    private static int random1To100()    {
        int rnd = r.nextInt(100) + 1;
        return rnd;
    }

    public static void main(String[] args)  {

        getFloat("Enter float:");
        // write a function that gets as parameter Scanner s and String msg
        // println(msg)
        // s.nextFloat
        // return the float

        // write a function that gets as parameter Random R
        // and returns a random number between 1-100 (0-99) + 1

        // create a function that prints an int[] array
        // write a function that gets an array int[] and puts zeros in the array
        // in main function create array with {1,2,3}
        // send the array to the print function
        // send the array to the zero function you just written
        // send the array to the print function



    }

}
