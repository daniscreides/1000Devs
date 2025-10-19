// Calculo Media Escolar

import java.util.Scanner;
public class MediaEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        float nota1 = scanner.nextFloat();

        System.out.print("Digite a segunda nota: ");
        float nota2 = scanner.nextFloat();

        float media = (nota1 + nota2) / 2;

        if (media == 10) {
            System.out.printf("Aluno aprovado com honras! Sua média é %.2f%n!", media);
        } else if (media >= 7) {
            System.out.printf("Aluno Aprovado! Sua média é %.2f%n", media);
        } else if (media < 7)
            System.out.printf("Aluno Reprovado! Sua média é %.2f%n", media);
        
        scanner.close();
    }
}