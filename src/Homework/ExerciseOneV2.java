package Homework;

public class ExerciseOneV2 {
    String name ="Kirtan"; //instance V1 1.1
    String surname = "Jagdish"; // Instance V2 1.1

    public static void main(String[] args) { //Main method Declared 1.4
        ExerciseOneV2 t = new ExerciseOneV2(); // Create Object of instance method 1.4
        t.m1(); //calling instance method 1.5
    }


    //Instance method 1.2
    public void m1(){
        System.out.println(name); //Instance variable called in print line 1.3
        System.out.println(surname); //Instance variable called in print line 1.3
    }
}
