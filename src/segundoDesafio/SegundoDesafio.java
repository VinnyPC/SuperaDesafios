package segundoDesafio;

import java.util.Scanner;

public class SegundoDesafio {

  public static void main(String[] args) {
  
    Scanner sc = new Scanner(System.in);

    double valor = sc.nextDouble();

    int[] notas = {100, 50, 20, 10, 5, 2};

    double[] moedas = {1, 0.50, 0.25, 0.10, 0.05, 0.01};

    System.out.println("NOTAS:");

    for (int nota : notas) {
     
      int quantidade = (int) (valor / nota);

      System.out.println(quantidade + " nota(s) de R$ " + nota + ".00");

      valor -= quantidade * nota;
    }

    System.out.println("MOEDAS:");

    for (double moeda : moedas) {
      int quantidade = (int) (valor / moeda);
      System.out.println(quantidade + " moeda(s) de R$ " + String.format("%.2f", moeda).replace(',', '.'));
      valor -= quantidade * moeda;
    }
  }
}
