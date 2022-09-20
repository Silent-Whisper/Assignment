import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Enter your number:");
        num = input.nextInt();

        if ((num%10)%2 == 0 || (num/10)%2 == 0 ){
            System.out.println("There is an even number");
        }else {
            System.out.println("There is no even number");
        }
    }
}
