package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class ascending {
   static void descorder(char[] s) {
	   Arrays.sort(s);
	   reverse(s);
   }
   static void reverse(char[] a) {
	   int n=a.length;
	   char t;
	   for(int i=0;i<n/2;i++) {
		   t=a[i];
		   a[i]=a[n-i-1];
		   a[n-i-1]=t;
	   }
   }
   public static void main(String []args) {
	   Scanner sc=new Scanner(System.in);
	   String a=sc.nextLine();
	   char[] str=a.toCharArray();
	   descorder(str);
	   System.out.println(String.valueOf(str));
   }
}
