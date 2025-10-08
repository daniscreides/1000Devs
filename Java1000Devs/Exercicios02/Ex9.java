//Efetuar a leitura de um valor numérico inteiro e apresentar o resultado do valor lido elevado ao quadrado.

import java.util.Scanner;
public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor numérico inteiro: ");
        int valor = scanner.nextInt();

        int valorAoQuadrado = valor * valor;

        System.out.printf("O valor %d elevado ao quadrado é: %d%n", valor, valorAoQuadrado);

        scanner.close();
    }
}