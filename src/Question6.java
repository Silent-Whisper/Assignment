import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean istrue;
        int tash = 1;
        System.out.println("Do you want to pay in several payments? answer in true or false.");
        istrue = input.nextBoolean();
        if (istrue){
            System.out.println("in how many payments would you like to pay?");
            tash = input.nextInt();

            if (tash >= 12){
                System.out.println("the payment will be done in 12 or more payments");
            }
            else{
                System.out.println("the payment will be done in "+tash+" payments");
            }
        }
        if (tash == 1){
            System.out.println("the payment will be done upfront.");
        }
    }
}
