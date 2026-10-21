import java.util.Scanner;
class Main {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter your current Age");
	int currentAge = sc.nextInt();

        int ageAfter5Years = currentAge + 5;
        int ageBefore3Years = currentAge - 3;
        int ageAfter10Years = currentAge + 10;

        System.out.println("Current age: " + currentAge);
        System.out.println("Age after 5 years: " + ageAfter5Years);	
        System.out.println("Age 3 years ago: " + ageBefore3Years);
        System.out.println("Age after 10 years: " + ageAfter10Years);
    }
}
