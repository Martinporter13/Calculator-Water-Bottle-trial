
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args)
    {
        System.out.println("Enter first and second number:");
        Scanner inp= new Scanner(System.in);
        double num1,num2;
        num1 = inp.nextDouble();
        num2 = inp.nextDouble();
        double ans;
        System.out.println("Enter your selection: 1 to add, 2 to subtract 3 to multiply and 4 to divide:");
        double choose;
        choose = inp.nextDouble();
        if (choose == 1) {
            System.out.println(add(num1, num2));
        } else if (choose == 2) {
            System.out.println(sub(num1, num2));
        } else if (choose == 3) {
            System.out.println(mult(num1, num2));
        } else if (choose == 4) {
            System.out.println(div(num1, num2));
        } else {
            System.out.println("Illegal Operation");
        }
    }
    public static double add(double x, double y)
    {
        double result = x + y;
        return result;
    }
    public static double sub(double x, double y)
    {
        double result = x-y;
        return result;
    }
    public static double mult(double x, double y)
    {
        double result = x*y;
        return result;
    }
    public static double div(double x, double y)
    {
        double result = x/y;
        return result;
    }

}

