//Um posto está vendendo combustíveis com a seguinte tabela de descontos:
//Álcool:
//- até 20 litros, desconto de 3% por litro
//- acima de 20 litros, desconto de 5% por litro
//Gasolina:
//- até 20 litros, desconto de 4% por litro
//- acima de 20 litros, desconto de 6% por litro
//Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível como um número inteiro (codificado da seguinte forma: 1 - álcool, 2 - gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 5,50 e o preço do litro do álcool é R$ 3,90.

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float precoGasolina = 5.50f;
        float precoAlcool = 3.90f;

        try {

            int tipo;

            while (true) {

                System.out.println("Escolha a opção:\n1 - Álcool\n2 - Gasolina ");
                tipo = scanner.nextInt();

                if (tipo == 1 || tipo == 2) {
                    break;

                } else {
                    System.out.println("Opção inválida! Digite apenas 1 para Álcool ou 2 para Gasolina.\n");
                }
            }

            System.out.println("Quantos litros deseja colocar?");
            float litros = scanner.nextFloat();

            float precoLitros = (tipo == 1) ? precoAlcool : precoGasolina;
            float desconto;

            if (tipo == 1) {
                desconto = (litros <= 20) ? 0.03f : 0.05f;

            } else {
                desconto = (litros <= 20) ? 0.04f : 0.06f;
            }

            float totalComDesconto = litros * precoLitros * (1 - desconto);
            String nomeCombustivel = (tipo == 1) ? "Álcool" : "Gasolina";

            System.out.printf("\nCombustível: %s%n", nomeCombustivel);
            System.out.printf("Total a pagar: R$ %.2f Desconto de %.0f%%%n", totalComDesconto, desconto * 100);

        } catch (Exception e) {
            System.out.println("Erro: entrada inválida! Digite apenas 1 para Álcool ou 2 para Gasolina.");
            scanner.nextLine();
        }

        scanner.close();
    }
}
