//Elaborar um programa que apresente o valor da conversão em real (R$) de um valor lido em dólar (US$). O programa deve solicitar o valor da cotação do dólar e também a quantidade de dólares disponível com o usuário.

import java.util.Scanner;
public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a cotação do dólar (em R$): ");
        double cotacaoDolar = scanner.nextDouble();

        System.out.print("Digite a quantidade de dólares (US$) que você possui: ");
        double quantidadeDolares = scanner.nextDouble();

        double valorEmReais = cotacaoDolar * quantidadeDolares;

        System.out.printf("O valor em reais (R$) é: %.2f%n", valorEmReais);

        scanner.close();
    }
}