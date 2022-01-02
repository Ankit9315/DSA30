package dsa;

import java.util.Scanner;

public class GCD {
	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  int a=sc.nextInt();
		  int b=sc.nextInt();

        System.out.println( hcf(a,b));
    }

    public static int hcf(int n1, int n2)
    {
        if (n2 != 0)
            return hcf(n2, n1 % n2);
        else
            return n1;
    }
}
