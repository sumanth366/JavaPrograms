package HackerRank;


	
	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.regex.*;

	public class PairsOfSocks {

	    // Complete the sockMerchant function below.
	    static int sockMerchant(int n, int[] ar) {
	        int count = 1, count1=0;
	        for(int i=0; i < n; i++)
	        {
	            if(ar[i]!=0)
	            {
	            for(int j=i+1; j<n; j++)
	            {
	                if(ar[i] == ar[j])
	                {
	                    ar[j] = 0;
	                    count++;
	                }
	            }
	            count = count/2;
	            count1 = count1 + count;
	            count = 1;
	            }
	        }
	        return count1;
	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	    	System.out.println("Enter the size of array");
	        int n = scanner.nextInt();

	        int[] ar = new int[n];

	        System.out.println("Enter array values");

	        for (int i = 0; i < n; i++) {
	        	ar[i] = scanner.nextInt();
	        }

	        int result = sockMerchant(n, ar);
	        System.out.println("The number of pairs of socks is/are " + result);
	     
	    }
	


}
