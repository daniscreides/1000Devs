package Exercicios01;
//Exercício 06: A lanchonete Gostosura vende apenas um tipo de sanduíche, cujo recheio inclui duas fatias de queijo, uma fatia de presunto e uma rodela de hambúrguer. Sabendo que cada fatia de queijo ou presunto pesa 50 gramas, e que a rodela de hambúrguer pesa 120 gramas, faça um algoritmo em que o dono forneça a quantidade de sanduíches a fazer, e a máquina informe as quantidades (em quilos) de queijo, presunto e carne necessários para compra.

import java.util.Scanner;
public class Sanduiches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeSanduiches;
        float pesoQueijoPorSanduiche = 0.1f; // 2 fatias de queijo (50g cada)
        float pesoPresuntoPorSanduiche = 0.05f; // 1 fatia de presunto (50g)
        float pesoHamburguerPorSanduiche = 0.12f; // 1 rodela de hambúrguer (120g)

        float totalPesoQueijo;
        float totalPesoPresunto;
        float totalPesoHamburguer;

        System.out.print("Digite a quantidade de sanduíches a fazer: ");
        quantidadeSanduiches = scanner.nextInt();

        totalPesoQueijo = quantidadeSanduiches * pesoQueijoPorSanduiche;
        totalPesoPresunto = quantidadeSanduiches * pesoPresuntoPorSanduiche;
        totalPesoHamburguer = quantidadeSanduiches * pesoHamburguerPorSanduiche;

        System.out.printf("Quantidade de queijo necessária: %.3f kg%n", totalPesoQueijo);
        System.out.printf("Quantidade de presunto necessária: %.3f kg%n", totalPesoPresunto);
        System.out.printf("Quantidade de carne necessária: %.3f kg%n", totalPesoHamburguer);

        scanner.close();
    }
}   