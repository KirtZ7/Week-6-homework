package Homework;

import java.util.Scanner;

public class ExerciseFive {

    int add, subtract,multiply; //instance variables
    public static void main(String[] args) {
        int num1, num2, add, subtract, multiply; //local variables
        float divide; //local variables
        Scanner scanner = new Scanner(System.in); // scanner obj

        System.out.println("Enter two numbers: ");
        num1 = scanner.nextInt(); //get user inputs via scanner class
        num2 = scanner.nextInt(); //get user inputs via scanner class

        add = num1 + num2; //math
        subtract = num1 - num2; //math
        multiply = num1 * num2; //math
        divide = (float) num1 / num2; //math

        System.out.println("Sum = " + add); //call out the functions
        System.out.println("Difference = " + subtract); //call out the functions
        System.out.println("Multiplication = " + multiply); //call out the functions
        System.out.println("Division = " + divide); //call out the functions
    }
}

