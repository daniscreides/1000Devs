//Elaborar um programa que leia o valor numérico correspondente ao salário mensal (variável SM) de um trabalhador e também faça a leitura do valor do percentual de reajuste (variável PR) a ser atribuído. Apresentar o valor do novo salário (variável NS).

import java.util.Scanner;
public class Ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salário mensal (SM): ");
        double SM = scanner.nextDouble();

        System.out.print("Digite o percentual de reajuste (PR): ");
        double PR = scanner.nextDouble();

        double NS = SM + (SM * PR / 100);
        System.out.printf("O valor do novo salário (NS) é: %.2f%n", NS);
        
        scanner.close();
    }
}