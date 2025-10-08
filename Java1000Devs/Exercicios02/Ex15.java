//Elaborar um programa que leia quatro valores numéricos inteiros (variáveis A, B, C e D). Ao final o programa deve apresentar o resultado do produto (variável P) do primeiro com o terceiro valor, e o resultado da soma (variável S) do segundo com o quarto valor.

import java.util.Scanner;
public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = scanner.nextInt();

        System.out.print("Digite o valor de C: ");
        int C = scanner.nextInt();

        System.out.print("Digite o valor de D: ");
        int D = scanner.nextInt();

        int P = A * C;
        int S = B + D;

        System.out.println("O valor do produto de A e C (P) é: " + P);
        System.out.println("O valor da soma de B e D (S) é: " + S);

        scanner.close();
    }
}