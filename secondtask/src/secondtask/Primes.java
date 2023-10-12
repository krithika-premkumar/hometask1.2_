package secondtask;

import java.util.Scanner;

	public class Primes {
		  public static void main(String[] args) {
			  System.out.println("Enter a value until which you would like to find the primes");
			  Scanner input = new Scanner(System.in);
		    int nValues = Integer.parseInt(input.nextLine());
            input.close();
		    OuterLoop: for (int i = 2; i <= nValues; i++) 
		    {
		      for (int j = 2; j <= Math.sqrt(i); j++) 
		      {
		        if (i % j == 0) 
		        {
		          continue OuterLoop;
		        }
		      }
		      System.out.println(i);
		    }
		  }
		}