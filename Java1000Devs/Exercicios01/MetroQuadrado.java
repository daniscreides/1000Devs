package Exercicios01;
//Exercício 01: Uma imobiliária vende apenas terrenos retangulares. Faça um algoritmo para imprimir a área do terreno e o valor de venda do mesmo. Para isto será necessário o usuário informar as dimensões em metros (frente e lateral) do terreno além do valor cobrado pelo metro quadrado.

import java.util.Scanner;
public class MetroQuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float frente;
        float lateral;
        float valorPorMetroQuadrado;
        float area;
        float valorTotal;

        System.out.print("Digite a dimensão da frente do terreno (em metros): ");
        frente = scanner.nextFloat();

        System.out.print("Digite a dimensão lateral do terreno (em metros): ");
        lateral = scanner.nextFloat();

        System.out.print("Digite o valor cobrado por metro quadrado: R$ ");
        valorPorMetroQuadrado = scanner.nextFloat();

        area = frente * lateral;
        valorTotal = area * valorPorMetroQuadrado;

        System.out.printf("A área do terreno é: %.2f metros quadrados.%n", area);
        System.out.printf("O valor total de venda do terreno é: R$ %.2f%n", valorTotal);

        scanner.close();
    }
}