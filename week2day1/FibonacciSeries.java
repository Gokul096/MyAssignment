package week2day1;

public class FibonacciSeries {
public static void main(String[] args) {
	//0 1 1 2 3 5 8 13 21 34 55 89......
	int a=0;
	int b=1;
	int c;
	int d=11;
	System.out.println(a);
	System.out.println(b);
	for (int i=0;i<=d;i++) {
		c=a+b;
		System.out.println(c);
		a=b;
		b=c;
	}
	
}
}
