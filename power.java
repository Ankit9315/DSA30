package dsa;

import java.util.Scanner;

public class power {
	public static int power(int x, int y)
		{
			if (y == 0)
		        return 1;
		    else if (y % 2 == 0)
		        return power(x, y / 2) * power(x, y / 2);
		    else
		        return x * power(x, y / 2) * power(x, y / 2);
		}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(power(a,b));
	}
}
