/**
 *Created by Raman Kryvasheyeu
 *Homework #1 on GB_Java_1 24.08.2016
 */
package com.company;

public class Main {

    public static void main(String[] args) {
        /*
        Task #1&2
         */
        byte a = 127;
        short b = 32767;
        int c = 2147483647;
        long d = 9223372036854775807L;
        float e = 0.000000000000000000000000000000000000000000001f;
        double f = 0.00000000000000000000000000000000000000000000005d;
        boolean g = false;
        char i = 'f';
        String name = "rtfm";

        expression1(10, 20, 30, 40);  //Task #3 method call

        System.out.println(compareSum(5, 10));  //Task #4 method call

        yearCheck(2016);    //Task #5* method call
    }
    /*
    Task #3 implementation
     */
    public static void expression1(int a, int b, int c, double d){
        System.out.println("a*(b+(c/d)) = "+a*(b+(c/d)));
    }
    /*
    Task #4 implemetation
     */
    public static boolean compareSum(int a, int b){
        boolean ab = false;
        if ((a + b) >= 10 && (a + b) <= 20){
            ab = true;
        }
        return ab;
    }
    /*
    Task #5* implementation
     */
    public static void yearCheck(int year) {
        if ((year % 4) == 0 && (year % 100) != 0 || (year % 400) == 0 ) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }
}
