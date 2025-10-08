package Exercicios01;
//Exercício 03: Faça um algoritmo para calcular quantas ferraduras são necessárias para equipar todos os cavalos comprados para um haras. O usuário devera informar a quantidade de cavalos adquiridos.

import java.util.Scanner;

public class Ferradura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeCavalos;
        int ferradurasPorCavalo = 4;
        int totalFerraduras;
        float valorPorFerradura;
        float valorTotal;

        System.out.print("Digite a quantidade de cavalos adquiridos: ");
        quantidadeCavalos = scanner.nextInt();

        System.out.print("Digite o valor de cada ferradura: R$ ");
        valorPorFerradura = scanner.nextFloat();

        totalFerraduras = quantidadeCavalos * ferradurasPorCavalo;
        valorTotal = totalFerraduras * valorPorFerradura;

        System.out.println("Serão necessárias " + totalFerraduras + " ferraduras para equipar todos os cavalos.");
        System.out.printf("O valor total das ferraduras será: R$ %.2f%n", valorTotal);

        scanner.close();
    }
}
