//Efetuar o cálculo e apresentar o valor de uma prestação de um bem em atraso, utilizando a fórmula PRESTAÇÃO+-- VALOR+ (VALOR* (TAXA/100) * TEMPO).

import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da prestação: ");
        double valorPrestacao = scanner.nextDouble();

        System.out.print("Digite a taxa de juros (em %): ");
        double taxaJuros = scanner.nextDouble();

        System.out.print("Digite o tempo em atraso (em meses): ");
        int tempoAtraso = scanner.nextInt();

        double valorFinal = valorPrestacao + (valorPrestacao * (taxaJuros / 100) * tempoAtraso);

        System.out.printf("O valor da prestação em atraso é: R$ %.2f%n", valorFinal);

        scanner.close();
    }
}