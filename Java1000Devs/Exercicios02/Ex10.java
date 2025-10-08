//Ler dois valores numéricos inteiros (representados pelas variáveis A e B) e apresentar o resultado do quadrado da diferença do primeiro valor (variável A) em relação ao segundo valor (variável B).

import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor inteiro A: ");
        int a = scanner.nextInt();

        System.out.print("Digite o valor inteiro B: ");
        int b = scanner.nextInt();

        int diferenca = a - b;
        int quadradoDaDiferenca = diferenca * diferenca;

        System.out.printf("O quadrado da diferença entre %d e %d é: %d%n", a, b, quadradoDaDiferenca);

        scanner.close();
    }
}