import java.util.Scanner;
class temperature {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter f:\t");
		int f=sc.nextInt();
		float c=(f-32)*(5/9);
		System.out.println("c :"+c);

	}

}
