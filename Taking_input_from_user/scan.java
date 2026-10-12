import java.util.Scanner;

class Scan{
	public static void main(String[]args){
		System.out.println("Taking input from user");
		Scanner ac = new Scanner(System.in);

		System.out.println("Enter Your Age");
		int age = ac.nextInt();
		
		if(age>=18){
		System.out.println("Eligible for voting");
		}else{
		System.out.println("You Are Not Eligible For Voting");
		}

}
}