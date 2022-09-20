import java.util.Scanner;

public class Question1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean hasDegree;
        double managementTime, age;
        System.out.println("Do you have a degree in management? Answer true/false:");
        hasDegree = input.nextBoolean();
        System.out.println("How many years do you have in management?");
        managementTime = input.nextDouble();
        System.out.println("How old are you?");
        age = input.nextDouble();

        if (hasDegree && managementTime >= 3.0 && age >= 35){
            System.out.println("True");
        } else{
            System.out.println("False");
        }

    }
}
