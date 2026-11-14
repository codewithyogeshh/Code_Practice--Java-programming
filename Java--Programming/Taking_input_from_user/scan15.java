import java.util.Scanner;

class Demo{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");

        int age = sc.nextInt();

        System.out.println("Your age: " + age);

        sc.close();
    }
}