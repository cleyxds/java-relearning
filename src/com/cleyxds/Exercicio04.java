package com.cleyxds;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio04 {
  static int quilo = 12;
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat();

    double peso = 0;

    System.out.print("Valor pesado em quilos: ");
    peso = reader.nextDouble();

    System.out.println("Valor a pagar: R$ " + df.format((quilo * peso)));
  }
}
