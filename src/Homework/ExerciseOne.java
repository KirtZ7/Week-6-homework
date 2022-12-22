package Homework;
/*
Write a Java programme using the following steps.
1.1 Declare two instance variables.
1.2 Declare one instance method.
1.3 Call both instance variables into the instance method inside the print
statement. 1.4 Declare the Main method.
1.5 Call the above instance method into the Main method and Run the programme.
*/

public class ExerciseOne {

    int i = 150; //Instance Variable
    int x = 10; //Instance Variable
    int y = 50; //Instance Variable
    public static void main(String[] args) { //Declared main method
        int a = 10; //Local Variable
        int b = 20; //Local Variable
        int c = a + b; //Local Variable

        System.out.println("A + B = " + c); // call local variable

        ExerciseOne eo = new ExerciseOne(); //make obj
        System.out.println(eo.i); //call variable via object
    }

}
