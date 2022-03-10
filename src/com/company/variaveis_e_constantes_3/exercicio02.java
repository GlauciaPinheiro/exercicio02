package com.company.variaveis_e_constantes_3;
/*
*crie um programa que leia , do console, o nome e o sobrenome de uma pessoa e depoi imprima o nome completo.
* para isso, voce vai precisa de duas variaveis: a primeira voce pode chamar de "nome" e a segunda de
* "sobrenome". por ultimo, voce vai juntar o nome e o sobrenome em uma unica impressao.
 */

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Informe seu sobrenome: ");
        String sobrenome = scanner.nextLine();
        System.out.println( nome + sobrenome );
        scanner.close();


    }
}
