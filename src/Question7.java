import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.lang.Math;

public class Question7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a,b,c;
        System.out.println("Enter the value for a:");
        a = in.nextDouble();
        System.out.println("Enter the value for b:");
        b = in.nextDouble();
        System.out.println("Enter the value for c:");
        c = in.nextDouble();
        if (Math.pow(b,2)-4*a*c >= 0) {
            System.out.println("the roots of the equation are: \n" + (((-1) * b + Math.sqrt(Math.pow(b, 2) + (-4) * a * c)) / 2 * a));
            System.out.println((((-1) * b - Math.sqrt(Math.pow(b, 2) + (-4) * a * c)) / 2 * a));
        }
        else{
            System.out.println("there are no roots for the equation");
        }
    }
}
