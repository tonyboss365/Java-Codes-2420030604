import java.util.Scanner;
public class studentdetails {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("your name");
	    String name=sc.nextLine();
        System.out.println("your age");
        int age=sc.nextInt();
        System.out.println("your roll no");
        long roll=sc.nextLong();
        System.out.println("your gender");
        char gender=sc.next().charAt(0);
        System.out.println("you passed(true/false)");
        boolean passed=sc.nextBoolean();
        System.out.println("percentage :");
        float percentage=sc.nextFloat();
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
        System.out.println("Roll :"+roll);
        System.out.println("Gender :"+gender);
        System.out.println("passed :"+passed);
        System.out.println("percentage:"+percentage);
        //single line print
        System.out.println("\nname :"+name+"\nage :"+age+"\nroll :"+roll+"\ngender :"+gender+"\npassed :"+passed+"\npercentage :"+percentage);
        
	}

}
