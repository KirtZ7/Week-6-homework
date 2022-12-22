package Homework;

import java.util.Scanner;

public class Exercise15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //get user data input

        int a, b, c; //Declare variable datatype

        System.out.println("Enter value a: "); //ask user to input number
        a = input.nextInt(); // assign user input to variable

        System.out.println("Enter value b: "); //ask user to input number
        b = input.nextInt(); // assign user input to variable

        System.out.println("Before SWAP a = " + a + ", b = " + b); //Print out original values

        //Swapped original values to one another + add empty variable to store data for swap
        c = a;
        a = b;
        b = c;

        System.out.println("After SWAP a = " + a + ", b = " + b); //Print out swapped values
    }
}
