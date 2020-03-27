package HackerRank;

import java.io.IOException;
import java.util.Scanner;

public class CountingValleys {

	  static int countingValleys(int n, String s) {
	        int altitude=0,valleys=0;
	        for(int i =0;i<s.length();i++)
	        {
	        if (s.charAt(i) == 'D') 
	        altitude--;
	        if (s.charAt(i) == 'U')
	        {
	            altitude++;
	            if (altitude == 0) 
	            valleys++;
	        }
	        }

	        return valleys;
	    }

	  private static final Scanner scanner = new Scanner(System.in);
	  
	  public static void main(String[] args) throws IOException {
	    	System.out.println("Enter the no. of steps");
	        int n = scanner.nextInt();

	        String s;

	        System.out.println("Enter steps");
	        s = scanner.next();
	        

	        int result = countingValleys(n, s);
	        System.out.println("The number of valleys " + result);
	     
	    }
}
