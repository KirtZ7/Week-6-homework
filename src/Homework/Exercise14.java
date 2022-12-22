package Homework;

import java.util.Scanner;
public class Exercise14 {
    public static void main(String[] args)
    {
        double l, h, perimeter, area; //give variables double datatype
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length of rectangle:"); //get user input
        l = s.nextInt(); //store data in variable

        System.out.print("Enter height of rectangle:"); //get user input
        h = s.nextInt(); //store data in variable

        s.close(); //Close scanner to avoid memory leak

        perimeter = 2 * (l + h); //parameter math
        System.out.println("Perimeter of rectangle:"+perimeter); // print parameter out

        area = l * h; //area math
        System.out.println("Area of rectangle:"+area); // print area out
    }
}
