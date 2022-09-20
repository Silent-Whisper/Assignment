import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.println("What is the number?");
        num = input.nextInt();

        if (num < 0){
            System.out.println("Negative number!");
            System.out.println(num * -1);
        }
    }
}
