import java.util.Scanner;

class Eligible{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Experience");
	int Experience = sc.nextInt();

	System.out.println("Enter Salary");
	int Salary = sc.nextInt();
  	//if experience is more than 5 year and salary is less than 25000 then you're eligible
	if(Experience >= 5 && Salary <= 25000){
		System.out.println("Bonus Eligible");
	}else{
		System.out.println("Not Eligible");
	}

	


}
}