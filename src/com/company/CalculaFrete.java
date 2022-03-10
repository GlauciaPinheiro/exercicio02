package com.company;

import java.util.Scanner;

public class CalculaFrete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite o valor do produto: ");
        Double valorProduto = scanner.nextDouble();
        System.out.print("Informe o valor do frete: ");
        Integer freteProduto = scanner.nextInt();
        Double valorFreteProduto = valorProduto + freteProduto;
        System.out.print("O valor do produto com o  frete é: " + valorFreteProduto);
        scanner.close();
    }
}