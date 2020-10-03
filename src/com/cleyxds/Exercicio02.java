package com.cleyxds;

import java.util.Scanner;

public class Exercicio02 {
  static int ano = 365;

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    String nome;
    int idade;

    System.out.print("Seu nome: ");
    nome = reader.nextLine();
    System.out.print("Sua idade: ");
    idade = reader.nextInt();

    System.out.println(nome + ", você ja viveu " + (idade * ano) + " dias");
  }
}
