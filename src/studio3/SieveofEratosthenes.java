package studio3;

import java.util.Scanner;

public class SieveofEratosthenes {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Select the number you would like to find the prime numbers within.");
		int n = scan.nextInt();
		boolean[] primes = new boolean[n];
	
		int i = 2; // remember to handle 0, 1, 2 at start of loop
		int j = 2;
		 
		for (int x = 0; x < primes.length; x++) {
			primes[x] = true;
	
		}
		
		while (i < n) {
			while (j < n) {  
				j = i * j;
				primes[j-1] = false;
				
				if (i % j == 0) {
					System.out.println("Not Prime");
					j--;
				}
			i++;
			j = 2;
			}
	
		for (int k = 2;  k < primes.length; k++) {
				if (primes[k] = true); 
				System.out.println(k);
				}

}
}
}