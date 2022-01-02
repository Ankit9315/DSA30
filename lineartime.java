package dsa;

import java.util.Arrays;

public class lineartime {
	static void sortString(String str) {
        char []arr = str.toCharArray();
        Arrays.sort(arr);
        System.out.print(String.valueOf(arr));
    }
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        sortString(s);
    }
}
