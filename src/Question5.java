import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,num1,num2,biggest = 0,smallest = 0,middle = 0;
        System.out.println("Enter the first number:");
        num = input.nextInt();
        System.out.println("Enter the second number:");
        num1 = input.nextInt();
        System.out.println("Enter the third number:");
        num2 = input.nextInt();

        if (num > num1 && num > num2){
            biggest = num;
            if (num1 > num2){
                smallest = num2;
                middle = num1;
            } else {
                middle = num2;
                smallest = num1;
            }
        } else if (num1 > num && num1 > num2){
            biggest = num1;
            if (num > num2){
                smallest = num2;
                middle = num;
            } else {
                middle = num2;
                smallest = num;
            }
        } else if (num2 > num1 && num2 > num){
            biggest = num2;
            if (num1 > num){
                smallest = num;
                middle = num1;
            } else {
                smallest = num1;
                middle = num;
            }
        }

        if (biggest - middle == middle - smallest){
            System.out.printf("These three numbers are a part of a mathematical series ");
        } else{
            System.out.println("These three numbers are not a part of a mathematical series");
        }

    }
}
