import java.util.Scanner;
class volumeofsphere {
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius:\t");
		int r=sc.nextInt();
		float vol=4*(3.14f)*r*r/3;
		System.out.println("vol: "+vol);
		
		
	}

}
