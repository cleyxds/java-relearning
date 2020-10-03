package com.cleyxds;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio01 {
  static double pao = 0.12, broa = 1.5;

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat();

    int paes = 0, broas = 0;

    System.out.print("Quantos pães vendeu?: ");
    paes = reader.nextInt();
    System.out.print("Quantas broas vendeu?: ");
    broas = reader.nextInt();

    double lucro = (paes * pao) + (broas * broa);
    double poupanca = lucro * 0.1;

    System.out.println("O dono vai ter lucro de R$ " + df.format(lucro) + " e depositar na poupança R$ " + df.format(poupanca));
  }
}
