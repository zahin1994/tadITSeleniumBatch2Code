package java_session;

public class Swap_Strings {

	public static void main(String[] args) {

String S1 = "Hello";
String S2 = "World";
System.out.println(S1.length());
System.out.println(S2.length());
System.out.println(S1.substring(1, 3));

S1 = S1 + S2;
S2 = S1.substring(0, S1.length()-S2.length());
S1 = S1.substring(S2.length());
System.out.println(S1);
System.out.println(S2);

String S10 = "Zahin";
StringBuffer S11 = new StringBuffer(S10);
System.out.println(S11.reverse());



String S12 = "Selenium";
StringBuilder S13 = new StringBuilder(S12);
System.out.println(S13.reverse());
	}

}
