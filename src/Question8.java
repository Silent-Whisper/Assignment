import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("What is the three-digit number");
        num = in.nextInt();

        if (num/100 > (num%100)/10  && (num%100)/10> num%10){
            System.out.println("There is a mathematical series going down");
        } else if (num/100 < (num%100)/10  && (num%100)/10 < num%10){
            System.out.println("There is a mathematical series going upwards");
        } else {
            System.out.println("There is no mathematical series");
        }
    }
}
