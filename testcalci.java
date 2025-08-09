package lab4;
import mypackage.calculator; 
import java.util.Scanner;
public class testcalci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calculator calc = new calculator(); 
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Addition: " + calc.add(num1, num2));
        System.out.println("Subtraction: " + calc.subtract(num1, num2));
        sc.close();
    }
}