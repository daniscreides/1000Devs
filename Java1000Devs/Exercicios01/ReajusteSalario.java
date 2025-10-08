package Exercicios01;
//Exercício 04: Faça um algoritmo para ler o salário de um funcionário e aumentá-lo em 15%. Após o aumento, desconte 11% de INSS e 8% de FGTS. Imprima o salário inicial, o salário com o aumento, o salário final, o desconto do INSS, o desconto do FGTS e o Total de Descontos (INSS+FGTS).

import java.util.Scanner;
public class ReajusteSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float salarioInicial;
        float aumentoPercentual = 0.15f;
        float descontoINSSPercentual = 0.11f;
        float descontoFGTSPercentual = 0.08f;

        System.out.print("Digite o salário do funcionário: R$ ");
        salarioInicial = scanner.nextFloat();

        float aumento = salarioInicial * aumentoPercentual;
        float salarioComAumento = salarioInicial + aumento;

        float descontoINSS = salarioComAumento * descontoINSSPercentual;
        float descontoFGTS = salarioComAumento * descontoFGTSPercentual;
        float totalDescontos = descontoINSS + descontoFGTS;

        float salarioFinal = salarioComAumento - totalDescontos;

        System.out.printf("Salário inicial: R$ %.2f%n", salarioInicial);
        System.out.printf("Salário com aumento de 15%%: R$ %.2f%n", salarioComAumento);
        System.out.printf("Desconto do INSS (11%%): R$ %.2f%n", descontoINSS);
        System.out.printf("Desconto do FGTS (8%%): R$ %.2f%n", descontoFGTS);
        System.out.printf("Total de descontos (INSS + FGTS): R$ %.2f%n", totalDescontos);
        System.out.printf("Salário final após descontos: R$ %.2f%n", salarioFinal);

        scanner.close();
    }
}   