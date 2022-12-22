package Homework;

/*
Write a Java program that takes a number as user input and prints its multiplication table up to 10.
*/

//The Scanner class is used to get user input, and it is found in the java.util package.
import java.util.Scanner;

public class ExerciseTen {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: \n"); //tell user to
        int num1 = in.nextInt();

        System.out.println("Input number Time table: \n");

        // for loop to do the 10 times table.
        for (int i=1; i<= 10; i++){ // i variable is the multiplier. Num1 * i = answer
            System.out.println(num1 + " x " + (i) + " = " + (num1 * (i)));
            // i+1++ - starts from 1 and keeps incrementing till 10 (I = 0 - i = 10)
        }
    }
}
