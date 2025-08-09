package lab4;
import java.util.Scanner;
public class teststudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Studentinfo s1 = new Studentinfo();
        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Grade (A/B/C...): ");
        char grade = sc.next().charAt(0);
        sc.nextLine(); 
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        s1.setDetails(roll, grade, name);
        s1.showDetails();
        System.out.println("Accessing public name directly: " + s1.name); 
        // System.out.println("grade : " + s1.rollnumber);
        
        sc.close();
    }
}

