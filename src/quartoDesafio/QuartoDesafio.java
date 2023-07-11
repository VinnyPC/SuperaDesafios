package quartoDesafio;

import java.util.Scanner;

public class QuartoDesafio {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int ncases = input.nextInt();
		for (int i = 0; i < ncases; i++) {
			String frase = readLine(input);
			StringBuilder parte1 = new StringBuilder(frase.substring(0, frase.length() / 2));
			StringBuilder parte2 = new StringBuilder(frase.substring(frase.length() / 2, frase.length()));
			parte1.reverse();
			parte2.reverse();
			System.out.println(parte1.toString() + parte2.toString());
		}
	}
	
	public static String readLine(Scanner input) {
		String line = input.nextLine();
		while (line.isEmpty())
			line = input.nextLine();
		return line;
	}

}
