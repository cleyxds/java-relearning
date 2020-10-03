package com.cleyxds;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio06 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat();

    double[] notas = new double[3];
    double valor = 0;
    int x = 0;

    for (int i = 0; i < notas.length; i++) {
      System.out.print("Nota " + (i+1)+ ": ");
      notas[i] = reader.nextDouble();
    }

    for (int i = 0; i < notas.length; i++) {
     valor += (notas[i] * (i+1));
    }

    for (int i = 0; i < notas.length; i++) {
      x += (i+1);
    }

    System.out.println("Média ponderada: " + df.format(valor/x));
  }
}
