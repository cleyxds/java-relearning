package com.cleyxds;

import java.util.Scanner;

public class Exercicio07 {
  static int SMALL = 10, MEDIUM = 12, LARGE = 15;
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    int p, m, g;

    System.out.print("Quantidade de camisas pequenas: ");
    p = reader.nextInt();

    System.out.print("Quantidade de camisas médias: ");
    m = reader.nextInt();

    System.out.print("Quantidade de camisas grandes: ");
    g = reader.nextInt();

    System.out.println("Total arrecadado R$ " + ((SMALL * p) + (MEDIUM * m) + (LARGE * g)));
  }
}
