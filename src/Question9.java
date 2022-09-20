import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, sumodd = 0,sumeven = 0;
        System.out.println("enter a 5 digit number");
        num = in.nextInt();
        while (num>0){
            if ((num%10)%2 == 1){
                sumodd = sumodd + (num%10);
            }
            else{
                sumeven = sumeven + (num%10);
            }
            num = num/10;
        }
        if (sumeven != sumodd){
            System.out.println("false");
        }
        else{
            System.out.println("true");
        }
    }
}
