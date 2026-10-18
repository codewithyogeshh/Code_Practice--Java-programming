class demo{
public static void main(String[]args){

	String s1 = "hello";
	String s2 = new String("yogeshh");
	
	//दोन objects चे references compare करतो.
	System.out.println(s1==s2);
	//दोन objects ची content/value compare करतो.
	System.out.println(s1.equals(s2));
}

}