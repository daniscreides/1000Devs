//Elaborar um programa que apresente o valor da conversão em dólar (US$) de um valor lido em real (R$). O programa deve solicitar o valor da cotação do dólar e também a quantidade de reais disponível com o usuário.

import java.util.Scanner;
public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a cotação do dólar (em R$): ");
        double cotacaoDolar = scanner.nextDouble();

        System.out.print("Digite a quantidade de reais (R$) que você possui: ");
        double quantidadeReais = scanner.nextDouble();

        double valorEmDolares = quantidadeReais / cotacaoDolar;
        System.out.printf("O valor em dólares (US$) é: %.2f%n", valorEmDolares);
        
        scanner.close();
    } 
}