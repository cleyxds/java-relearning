package com.cleyxds;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio03 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat();

    double gasolina = 0, valor = 0;

    System.out.print("Qual o preço do litro?: ");
    gasolina = reader.nextDouble();
    System.out.print("Quantos R$ de gasolina?: ");
    valor = reader.nextDouble();
    double gas = (valor / gasolina);

    System.out.println("Você abasteceu " + df.format(gas) + " litros de gasolina com R$ " + df.format(valor));
  }
}
