package java_session;

public class Increm_Decrem_Operator2 {

	public static void main(String[] args) {

int i = 10;
int j = i++;
int k = j++ + i++;
int l = ++k + ++i + ++j;
int m = l-- + k-- - j-- - i--;
int n = --m + --l - --k - --j + --i;
int o = n++ + --m - ++l - k-- + --j - i++;
int p = o++ + ++o; 
int q = o++ + --o - n++ + m-- - --l + k++ - ++j - --j + j++ + i++;

System.out.println(i);
System.out.println(j);
System.out.println(k);
System.out.println(l);
System.out.println(m);
System.out.println(n);
System.out.println(o);
System.out.println(p);
System.out.println(q);
System.out.println(  );

int r = 15;
int s = r++ + ++r;
int t = ++r + ++s + s++;
int u = r++ + ++s - --t;
int v = --r + --t + ++t - u++;
int w = v++ + ++v;
int x = w++ + --v + u-- + ++t - --s + r++ + ++r - ++r;

System.out.println(r);
System.out.println(s);
System.out.println(t);
System.out.println(u);
System.out.println(v);
System.out.println(w);
System.out.println(x);
System.out.println(  );

int a = 20;
int b = ++a;
int c = b++ + ++a;
int d = --c + --b - --a;
int e = ++d + ++c - ++c - ++a;
int f = --e + ++d - --c + ++a + --b;
int g = --f + f--;
int h = ++g - --f + ++e + ++d - --c + b++ - --a - a-- + a++;

System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);
System.out.println(e);
System.out.println(f);
System.out.println(g);
System.out.println(h);



	}

}
