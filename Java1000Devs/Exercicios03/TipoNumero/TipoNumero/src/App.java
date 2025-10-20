//Leia um valor e apresenta uma frase que diz se o número é: par ou ímpar e positivo ou negativo. Caso o valor seja 0, mostre a mensagem: O número digitado é neutro.

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            if (numero == 0) {
                System.out.println("O número digitado é neutro.");

            } else {
                
                if (numero % 2 == 0) {
                    System.out.print("O número é PAR e ");

                } else {
                    System.out.print("O número é ÍMPAR e ");
                }

                if (numero > 0) {
                    System.out.println("POSITIVO.");
                    
                } else {
                    System.out.println("NEGATIVO.");
                }
            }

        } catch (Exception e) {
            System.out.println("Entrada inválida! Digite apenas números inteiros.");

        } finally {

            scanner.close();
        }
    }
}

