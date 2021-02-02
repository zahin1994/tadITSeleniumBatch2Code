package java_session;

public class Increm_Decrem_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int a=10;
int b=a++ + ++a + --a + a--;
int c=b-- - --b;
int d=c;

System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);

int i = 11;
int j = i++ + i++ + ++i;
int k = i++ + ++j + j++;
int l = k-- - --k + i-- - --i + k++;
int m = ++i;

System.out.println(i);
System.out.println(j);
System.out.println(k);
System.out.println(l);
System.out.println(m);


int e = 12;
int f = e++ + 1;
int g = f--;

System.out.println(e);
System.out.println(f);
System.out.println(g);


	}

}
