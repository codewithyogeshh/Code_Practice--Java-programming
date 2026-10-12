public class Demo {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("Hello");

        String combined = str1 + " World"; 

        int length = combined.length(); 
        char firstChar = combined.charAt(0); 

        boolean contentEqual = str1.equals("Hello"); 
        boolean referenceEqual = (str1 == str2); 

        System.out.println(combined);
        System.out.println(length);
        System.out.println(contentEqual);
    }
}   