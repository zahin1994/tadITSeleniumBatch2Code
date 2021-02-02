package java_session;

public class Strings {

	public static void main(String[] args) {

String S1 = "I'm learning Selenium.";
String S2 = "I'm working on Selenium.";
String S3 = "@^&*()jlbdu;bsdv;kj1234567ASDFGHJUYH";

System.out.println(S1 + S2);
System.out.println(S1.concat(S2));
if (S1 == S2) {
	System.out.println("Both strings are equal");
}
else {
	System.out.println("Both strings are not equal");
}

System.out.println(S1.equals(S2));
System.out.println(S1 != S2);

System.out.println(S1.charAt(3));
System.out.println(S1.indexOf('S'));

System.out.println(S1.indexOf("Selenium"));
System.out.println(S1.indexOf("Java"));

S1 = S1.toUpperCase();
System.out.println(S1);
System.out.println(S1.toLowerCase());
System.out.println(S1.trim());
System.out.println(S3.replaceAll("[^0-9a-zA-Z]", "?"));







	}

}
