package Homework;

public class ExerciseFiveNoScan {

    public static void main(String[] args) {
        ExerciseFiveNoScan eFive = new ExerciseFiveNoScan(); //create object
        addition(125,24); //call method using object name (Static) - Parameters
        subtraction(125,24); //call method directly (static) - Parameters
        eFive.multiplication(); //call method using object name - no parameters
        eFive.division(125,24); //call division method using object name - parameters
    }

    //Static Method 1
    //with parameters
    public static void addition(int o, int p) {

        System.out.println("Addition of " + o + " + " + p +  " = " + (o + p)); //Print statement with concatenation
    }

    //Static Method 2
    //with parameters
    public static void subtraction(int x, int y) {

        System.out.println("Subtraction of " + x + " - "+ y + " = " + (x - y)); //Print statement with concatenation
    }

    //instance method 1
    //empty parameters
    public void multiplication (){

        // Multiplication math to call answer o
        int m = 125;
        int n = 24;
        int o = m*n;
        System.out.println("Multiplication of " + m + " * "+ n + " = " + o); //Print statement with concatenation

    }

    //instance method 2
    //with parameters
    public void division (double a, double b){
        // Multiplication math to call answer c
        double c = a/b;
        System.out.println("Division of " + a + " / "+ b + " = " + c); //Print statement with concatenation
    }
}