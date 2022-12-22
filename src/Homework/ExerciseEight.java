package Homework;

import java.util.Scanner;

public class ExerciseEight {
    public static void main(String[] Strings) { //call method

        Scanner input = new Scanner(System.in);

        System.out.print("Input a degree in Fahrenheit: "); //get user input
        double c = input.nextDouble(); //store the data in variable

        double f = (9.0 / 5.0) * c + 32; //Convert C to F
        System.out.println(c + " degree Celsius is equal to " + f + " in Fahrenheit"); // print out result
    }
}

