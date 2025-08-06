package lab3;
import java.util.Scanner;
public class usernametransformer {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter a string: ");
        String name =sc.next();
        name = name.trim();             
        name = name.toLowerCase();       
        name = name.replace("a", "@");   
        System.out.println("Formatted Name: " + name);
    }
}
