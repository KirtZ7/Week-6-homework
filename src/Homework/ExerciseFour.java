package Homework;

public class ExerciseFour {

    String num1 = "One";
    String num2 = "Two";

    static int a = 1;
    static int b =2;

    public static void main(String[] args) {
        ExerciseFour methodDec = new ExerciseFour();
        methodDec.s1();
        s2();

    }

    public void s1(){
        System.out.println("This number = " + a + " is spelt like: " + num1);
        System.out.println("This number = " + b + " is spelt like: " + num2);
    }

    public static void s2(){
        ExerciseFour methodDec = new ExerciseFour();
        System.out.println("This word = " + methodDec.num1 + " is spelt like: " + a);
        System.out.println("This word = " + methodDec.num2 + " is spelt like: " + b);
    }


}
