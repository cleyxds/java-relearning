package com.cleyxds;

import java.util.Scanner;

public class Exercicio05 {
  static int eachMes = 30;
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    int dia = 0, mes = 0;

    System.out.print("Mẽs: ");
    mes = reader.nextInt();
    mes--;
    System.out.print("Dia do mês: ");
    dia = reader.nextInt();

    System.out.println("Já se passsaram " + ((mes * eachMes) + dia) + " dias");
  }
}
