import java.util.Scanner;

class Demo{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");

        int age = sc.nextInt();

        System.out.println("Your age: " + age);

	System.out.print("Enter your marks: ");

        double marks = sc.nextDouble();

        System.out.println("Your marks: " + marks);

        sc.close();
    }
}