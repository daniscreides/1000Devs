//Elaborar um programa que leia dois valores numéricos reais desconhecidos representados pelas variáveis A e B. Calcular e apresentar os resultados das quatro operações aritméticas básicas.

import java.util.Scanner;
public class Ex19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor de B: ");
        double b = scanner.nextDouble();

        double soma = a + b;
        double subtracao = a - b;
        double multiplicacao = a * b;
        double divisao = (b != 0) ? a / b : Double.NaN; // Evita divisão por zero

        System.out.printf("Soma (A + B): %.2f\n", soma);
        System.out.printf("Subtração (A - B): %.2f\n", subtracao);
        System.out.printf("Multiplicação (A * B): %.2f\n", multiplicacao);

        if (b != 0) {
            System.out.printf("Divisão (A / B): %.2f\n", divisao);
        } else {
            System.out.println("Divisão (A / B): Indefinida (não se divide número por zero)");
        }

        scanner.close();
    }
}