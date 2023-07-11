package primeiroDesafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PrimeiroDesafio {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		ArrayList<Integer> pares = new ArrayList<>();
	    ArrayList<Integer> impares = new ArrayList<>();
	    
	    for (int i = 0; i < n; i++) {
	        int num = input.nextInt();
	        if (num % 2 == 0) { 
	          pares.add(num); 
	        } else { 
	          impares.add(num);
	        }
	      }
	    
	    Collections.sort(pares);
	    Collections.sort(impares);
	    
	    for (int par : pares) {
	        System.out.println(par);
	      }
	    
	    for (int i = impares.size() - 1; i >= 0; i--) {
	        System.out.println(impares.get(i));
	      }

	}

}
