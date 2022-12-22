package extraHW;

/*Write a java program which remove extra space from both side “    I love java    ”
Expected output: “I love java”*/

public class ExerciseTwo {
    public static void main(String[] args) { //declare main method
        String java = "   I love java  "; //original string
        System.out.println(java.trim()); //string method .trim
        System.out.println(java); //no string method .trim

    }

}
