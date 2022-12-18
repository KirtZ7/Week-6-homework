package Homework;

public class ExerciseOne {

    int i = 150; //Instance Variable

    public static void main(String[] args) { //Declared main method
        int a = 10; //Local Variable
        int b = 20; //Local Variable
        int c = a + b; //Local Variable

        System.out.println("A + B = " + c); // call local variable

        ExerciseOne eo = new ExerciseOne(); //make obj
        System.out.println(eo.i); //call variable via object

    }

}
