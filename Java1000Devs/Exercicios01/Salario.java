package Exercicios01;
//Exercício 02: Faça um algoritmo que receba o valor do salário mínimo e o valor do salário de um funcionário, calcule e mostre a quantidade de salários mínimos que ganha esse funcionário.

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float salarioMinimo;
        float salarioFuncionario;
        float quantidadeSalarios;

        System.out.print("Digite o valor do salário mínimo: ");
        salarioMinimo = scanner.nextFloat();

        System.out.print("Digite o valor do salário do funcionário: ");
        salarioFuncionario = scanner.nextFloat();

        quantidadeSalarios = salarioFuncionario / salarioMinimo;

        System.out.printf("O funcionário ganha %.1f salários mínimos.", quantidadeSalarios);

        scanner.close();
    }
}