package com.company;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("This program will find the Greatest Common Divisor of two numbers.\n");
        System.out.print("Enter an integer: ");
        int a=intCatch();
        System.out.print("\nEnter another integer: ");
        int b=intCatch();
        System.out.println("\nThe Greatest Common Divisor of "+a+" and "+b+" is:\n");
        System.out.println("Recursively: "+NotGeometry.recurseYouEuclid(a,b)+"\nIteratively: "+NotGeometry.iterateEuclid(a,b));
    }
    public static Integer intCatch(){
        Scanner sc=new Scanner(System.in);
        Integer i=null;
        while (i==null){
            try{
                i=sc.nextInt();
            }
            catch (InputMismatchException ime){
                System.out.println("\nThat was not a valid integer.\n Enter a new integer value: ");
            }
        }

        return i;
    }

}
