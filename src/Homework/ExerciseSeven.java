package Homework;

import java.util.Scanner;

public class ExerciseSeven {
    public static void main(String[] Strings) { //call method

        Scanner input = new Scanner(System.in);

        System.out.print("Input a degree in Fahrenheit: "); //get user input
        double f = input.nextDouble(); //store the data in variable

        double c = ((5 * (f - 32.0)) / 9.0); //Convert F to C
        System.out.println(f + " degree Fahrenheit is equal to " + c + " in Celsius"); // print out result
    }
}
