package extraHW;

public class ExerciseSix {
    public static void main(String[] args) {
        String java = "I@Love@Java"; //original string
        System.out.println("First String =" + java); //Print original string
        String javaR = java.replaceAll("I@Love@Java", "I Love Java"); //replace text
        System.out.println("Updated String =" +javaR); //Print new string
    }
}
