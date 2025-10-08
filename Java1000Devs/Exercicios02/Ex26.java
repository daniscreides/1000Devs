//Ler dois valores numéricos inteiros (representados pelas variáveis A e B) e apresentar o resultado do quadrado da divisão do primeiro valor (variável A) em relação ao segundo valor (variável B).

import java.util.Scanner;
public class Ex26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A (número inteiro): ");
        int a = scanner.nextInt();

        System.out.print("Digite o valor de B (número inteiro): ");
        int b = scanner.nextInt();

        double resultado = Math.pow((double)a / b, 2); // Calcula o quadrado da divisão de A por B
        System.out.printf("O quadrado da divisão de %d por %d é: %.2f\n", a, b, resultado);
        
        scanner.close();
    }
}