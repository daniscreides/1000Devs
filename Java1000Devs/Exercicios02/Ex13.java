//Construir um programa que leia três valores numéricos inteiros (representados pelas variáveis A, B e C) e apresente como resultado final o valor da soma dos quadrados dos três valores lidos.

import java.util.Scanner;
public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = scanner.nextInt();

        System.out.print("Digite o valor de C: ");
        int C = scanner.nextInt();

        int somaDosQuadrados = A * A + B * B + C * C;
        System.out.println("A soma dos quadrados de A, B e C é: " + somaDosQuadrados);

        scanner.close();
    }   
}
