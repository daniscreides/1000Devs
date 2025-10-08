//Construir um programa que leia três valores numéricos inteiros (representados pelas variáveis A, B e C) e apresente como resultado final o valor do quadrado da soma dos três valores lidos.

import java.util.Scanner;
public class Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = scanner.nextInt();

        System.out.print("Digite o valor de C: ");
        int C = scanner.nextInt();

        int soma = A + B + C;
        int quadradoDaSoma = soma * soma;

        System.out.println("O valor do quadrado da soma de A, B e C é: " + quadradoDaSoma);

        scanner.close();
    }
}