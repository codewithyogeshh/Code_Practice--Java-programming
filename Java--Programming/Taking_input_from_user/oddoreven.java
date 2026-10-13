import java.util.Scanner;

class odd_even{
public static void main(String[]args){

	System.out.println("Odd OR Even Number Check");
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Number");
	int num = sc.nextInt();

	if(num%2==0){
	System.out.println("This is a Even Number");
	}else{
		System.out.println("This is a Odd Number");
	}
}
}