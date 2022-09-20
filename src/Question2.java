import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        double num;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Double:");
        num = input.nextDouble();

        if(num != (int)num){
            System.out.println("Not a whole number!");
        }
    }
}
