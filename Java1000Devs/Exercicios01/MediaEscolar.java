package Exercicios01;
// Calculo Media Escolar

import java.util.Scanner;
public class MediaEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        float nota1 = scanner.nextFloat();

        System.out.print("Digite a segunda nota: ");
        float nota2 = scanner.nextFloat();

        System.out.print("Digite a terceira nota: ");
        float nota3 = scanner.nextFloat();

        float media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("A média escolar é: %.2f%n", media);

        if (media >= 7) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado.");
        }

        scanner.close();
    }
}