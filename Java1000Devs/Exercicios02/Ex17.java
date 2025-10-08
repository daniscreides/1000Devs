//Elaborar um programa que calcule e apresente o valor do resultado da área de uma circunferência (variável A). O programa deve solicitar a entrada do valor do raio da circunferência (variável R). Para a execução deste problema utilize a fórmula A+- 3.14159265* R j 2.

import java.util.Scanner;
public class Ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do raio da circunferência: ");
        double raio = scanner.nextDouble();

        double area = 3.14159265 * Math.pow(raio, 2);

        System.out.printf("O valor da área da circunferência é: %.2f\n", area);

        scanner.close();
    }
}