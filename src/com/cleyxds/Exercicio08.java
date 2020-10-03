package com.cleyxds;

import java.util.Scanner;

public class Exercicio08 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    int[] x, y;
    x = new int[2]; //QUANTIDADE DE PONTOS
    y = new int[x.length];

    for (int i = 0; i < x.length; i++) {
      System.out.print("X do ponto " + (i+1) + " : ");
      x[i] = reader.nextInt();
      System.out.print("Y do ponto " + (i+1) + " : ");
      y[i] = reader.nextInt();
      System.out.println();
    }

    for (int i = 0; i < (x.length) - 1; i++) {
      x[i] = (x[i+1] - x[i]);
      y[i] = (y[i+1] - y[i]);
    }

    for (int i = 0; i < (x.length - 1); i++) {
      System.out.println("Distância entre o ponto " + (i+1) + " e o ponto " + (i+2) +" ("+ x[i] + "," + y[i] + ")");
    }
  }
}
