//Ler dois valores para as variáveis A e B e efetuar a troca dos valores de forma que a variável A passe a possuir o valor da variável B e a variável B passe a possuir o valor da variável A. Apresentar os valores após a efetivação do processamento da troca.

import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = scanner.nextInt();

        // Efetuar a troca dos valores
        int temp = A;
        A = B;
        B = temp;

        System.out.println("Após a troca:");
        System.out.println("Valor de A: " + A);
        System.out.println("Valor de B: " + B);

        scanner.close();
    }
}