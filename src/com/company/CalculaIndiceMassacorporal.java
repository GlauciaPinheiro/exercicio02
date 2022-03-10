package com.company;

import java.util.Scanner;


public class CalculaIndiceMassacorporal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculo do Indice Massa Corporal");
        System.out.println("Digite seu peso(en kg): ");
        Double peso = scanner.nextDouble();
        System.out.println("Digite sua altura (em metros): ");
        Double altura = scanner.nextDouble();
        Double AlturaAoQuadrado = altura * altura;
        Double indiceMassaCorporal = peso /AlturaAoQuadrado;
        System.out.println("seu IMC e:" + indiceMassaCorporal);
        scanner.close();
    }
}
