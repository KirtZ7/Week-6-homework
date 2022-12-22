package Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise16 {

    int binary1;
    int binary2;
    // Function to print integer to binary using
    int b1, b2; //hold binary numbers 0 and 1
    int i = 0, c = 0;
    int[] sum = new int[8]; //create array to show int into binary number
    int output=0, power=1;

    public static void main(String[] args) {

        Exercise16 e16 = new Exercise16(); //Create object
        //call methods
        e16.decimalToBinary();
        e16.binaryAddition();
        //e16.binaryToDecimal1();
        e16.binaryToDecimal2();
        System.out.println("Exiting the program");
        System.exit(0);
    }


    // Function converting decimal to binary
    public void decimalToBinary() {

        Scanner input = new Scanner(System.in); // get user data


        System.out.println("Enter first number (0- 127): ");
        binary1 = input.nextInt(); //store the number
        System.out.println("Binary Value = " + Integer.toBinaryString(binary1));

        System.out.println("Enter second number (0- 127): ");
        binary2 = input.nextInt(); //store the number
        System.out.println("Binary Value = " + Integer.toBinaryString(binary2));
    }




/*
    public void binaryToDecimal(){


        System.out.println("Binary number back to Int = " );
        int multiplier = 1;
        int a = 0;
        for (i = 0; i <= sum.length-1; --i ) {
            a = a * 10 + sum[i];
        }
    }
    */



    public void binaryToDecimal2(){

        for (i=0; i <7; i++)
        {

            output += sum[7-i]*power;
            System.out.println("Output = "+ output);
            power *= 2;

        }

        System.out.println(output);
    }




    public void binaryAddition() {
        Scanner input = new Scanner(System.in); // get user data


        System.out.print("Enter first binary number: "); //get first binary from user
        b1 = input.nextInt(); //store the number

        System.out.print("Enter second binary number: "); //get second binary from user
        b2 = input.nextInt(); //store the number

        input.close(); //Close scanner class to avoid memory leaks (learnt recently)

        //While loop for binary addition
        // https://beginnersbook.com/2018/09/java-program-to-add-two-binary-numbers/ //Code sample
        // https://www.youtube.com/watch?v=C5EkxfNEMjE // Adding binary to understand code
        // plus some knowledge from school

        while (b1 != 0 || b2 != 0) {
            sum[i++] = (int) ((b1 % 10 + b2 % 10 + c) % 2); //simple addition of (0+0) (0+1) (1+0) (1+1)
            c = (int) ((b1 % 10 + b2 % 10 + c) / 2); //carry 1 value
            b1 = b1 / 10; //carry 1 value check
            b2 = b2 / 10; //carry 1 value check
        }
        // binary 1's
        if (c != 0) {
            sum[i++] = c;
        }

        //binary 0s
        --i;
        System.out.print("Output: ");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }
        System.out.println(Arrays.toString(sum));
        System.out.print("\n");

        }
}