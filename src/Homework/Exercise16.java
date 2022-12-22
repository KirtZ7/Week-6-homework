package Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise16 {

    int binary1;
    int binary2;
    // Function to print integer to binary using
    int b1, b2; //hold binary numbers 0 and 1
    int i = 0, c = 0;
    int[] sum = new int[10]; //create array to show int into binary number

    public static void main(String[] args) {

        Exercise16 e16 = new Exercise16(); //Create object
        e16.decimalToBinary(); //call
        e16.a1();
        //e16.binaryToDecimal();
        System.out.println("Exiting the program");
        System.exit(0);
    }


    // Function converting decimal to binary
    public void decimalToBinary() {

        Scanner input = new Scanner(System.in); // get user data


        System.out.println("Enter first number : ");
        binary1 = input.nextInt(); //store the number
        System.out.println("Binary Value = " + Integer.toBinaryString(binary1));

        System.out.println("Enter second number: ");
        binary2 = input.nextInt(); //store the number
        System.out.println("Binary Value = " + Integer.toBinaryString(binary2));
    }


    /*
    public void binaryToDecimal(){

        System.out.println("Binary number back to Int = " );
        int multiplier = 1;
        for (i = 7; i >= 0; --i )
        {
            sum += (multiplier * sum[i]);
            multiplier *= 10;
        }
    }
*/


    public void a1() {
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