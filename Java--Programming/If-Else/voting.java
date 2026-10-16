import java.util.Scanner;
class demo{
public static void main(String[]args){
	System.out.println("Taking input from user");
	Scanner sc  = new Scanner(System.in);
	
	System.out.println("Enter Your Age");
	int age = sc.nextInt();

	if(age >= 18){
	System.out.println("Eligible for voiting");

	}else{
	System.out.println("you are not eligible for voting");
	}
	
}
}