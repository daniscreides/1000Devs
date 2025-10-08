package Exercicios01;
//Exercício 05: A granja Frangotech possui um controle automatizado de cada frango da sua produção. No pé direito do frango há um anel com um chip de identificação; no pé esquerdo são dois anéis para indicar o tipo de alimento que ele deve consumir. Sabendo que o anel com chip custa R$4,00 e o anel de alimento custa R$3,50, faça um algoritmo para calcular o gasto total da granja para marcar todos os seus frangos que deverá ser informado pelo usuário.

import java.util.Scanner;
public class GranjaFrangos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeFrangos;
        float custoAnelChip = 4.00f;
        float custoAnelAlimento = 3.50f;
        float custoTotal;

        System.out.print("Digite a quantidade de frangos na granja: ");
        quantidadeFrangos = scanner.nextInt();

        custoTotal = quantidadeFrangos * (custoAnelChip + 2 * custoAnelAlimento);

        System.out.printf("O gasto total para marcar todos os frangos é: R$ %.2f%n", custoTotal);

        scanner.close();
    }
}   

