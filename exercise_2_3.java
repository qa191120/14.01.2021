package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)  {
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        // base ^ power
        // base * base * base ... power times
        // 2 ^ 5
        int result = 2;
        for (int index = 2; index <= 5; index++) {
               result *= 2;
        }
        System.out.println(result);

        for (int base = 1 ; base <= 10; base++) { // 1..10
            for(int power = 1; power <= 5; power++) { // 1..5
                //System.out.println(String.format("%d ^ %d = %f", base, power,
                  //      Math.pow(base, power)));
                PrintPower(base, power);
            }
        }
    }

    private static void PrintPower(int base, int power) {
        int result_power = base;
        for (int index = 2; index <= power; index++) {
            result_power *= base;
        }
        System.out.println(String.format("%d ^ %d = %d", base, power
                      ,result_power));
    }
}
