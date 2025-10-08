//Elaborar um programa que calcule e apresente o valor do volume de uma caixa retangular, utilizando a fórmula VOLUME+-- COMPRIMENTO* LARGURA* ALTURA.

import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o comprimento da caixa retangular: ");
        double comprimento = scanner.nextDouble();

        System.out.print("Digite a largura da caixa retangular: ");
        double largura = scanner.nextDouble();

        System.out.print("Digite a altura da caixa retangular: ");
        double altura = scanner.nextDouble();

        double volume = comprimento * largura * altura;

        System.out.printf("O volume da caixa retangular é: %.2f%n", volume);

        scanner.close();
    }
}