package HackerRank;


	
	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.regex.*;

	public class RepeatedString {

	    // Complete the repeatedString function below.
	    static long repeatedString(String s, long n) {
	        long count=0;
	        long size = s.length();
	        long a = n/size;
	        long r = n%size;
	        for(int i = 0; i<size; i++)
	        {
	            if(s.charAt(i) == 'a')
	            count++;
	        }
	        count = count * a;
	        for(int j=0;j<r;j++)
	        {
	            if(s.charAt(j) == 'a')
	            count++;
	        }
	    return count;

	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	    	System.out.println("Enter the number of characters to consider");
	        long n = scanner.nextInt();

	        System.out.println("Enter steps");
	        String s = scanner.next();
	        

	        long result = repeatedString(s,n);
	        System.out.println("The number of 'a's repeated is  " + result);
	    }
	

}
