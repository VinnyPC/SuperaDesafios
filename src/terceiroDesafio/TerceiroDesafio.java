package terceiroDesafio;

import java.util.HashSet;
import java.util.Scanner;

public class TerceiroDesafio {

	public static void main(String[] args) {
		
	    Scanner input = new Scanner(System.in);

	    int n = input.nextInt();
	    int k = input.nextInt();

	    int[] arr = new int[n];

	    for (int i = 0; i < n; i++) {
	      arr[i] = input.nextInt();
	    }

	    int resultado = contaPares(arr, k);

	    System.out.println(resultado);
	  }

	  public static int contaPares(int[] arr, int k) {

	    int cont = 0;

	    HashSet<Integer> conjunto = new HashSet<>();

	    for (int num : arr) {

	      if (conjunto.contains(num + k)) {

	    	  cont++;
	      }


	      if (conjunto.contains(num - k)) {
	      
	    	  cont++;
	      }

	      conjunto.add(num);
	    }

	    return cont;
	}

}
