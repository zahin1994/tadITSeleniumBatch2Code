package java_session;

public class If_Else {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c = 30;
		if (a < b) {
			System.out.println("A is less than b");
		}
		else if (a > c) {
			System.out.println("a is greater than c");
		}
		else {
			System.out.println("false");
		}
		if (c > b) {
			System.out.println("c is greater than b");
		}
		else if (b < a) {
			System.out.println("B is less than a");
		}
		else {
			System.out.println("Not True");
		
		}
		
}
}