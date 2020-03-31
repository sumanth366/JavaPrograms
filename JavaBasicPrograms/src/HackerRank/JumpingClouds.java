package HackerRank;

import java.util.Scanner;

public class JumpingClouds {
	
	 static int jumpingOnClouds(int[] c) {

	        int count =0;
	        int size = c.length;
	        for(int i=0;i<size;)
	        {
	            if(i<size-2 && c[i+2]==0)
	            {
	                i=i+2;
	                count++;
	                if(i==(size-1))
	                    break;
	            }
	            else 
	            {
	                i=i+1;
	                count++;
	                if(i==(size-1))
	                break;
	            }
	        }

	    return count;

	    }

	    private static final Scanner scanner = new Scanner(System.in);


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the size of array");
        int n = scanner.nextInt();

        int[] ar = new int[n];

        System.out.println("Enter array values");

        for (int i = 0; i < n; i++) {
        	ar[i] = scanner.nextInt();
        }

        int result = jumpingOnClouds(ar);
        System.out.println("The minimum number of jumps to reach last cloud is " + result);
		

	}

}
