//Elaborar um programa que leia dois valores numéricos inteiros, os quais devem representar a base e o expoente de uma potência, calcule a potência e apresente o resultado obtido.

import java.util.Scanner;
public class Ex22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base (número inteiro): ");
        int base = scanner.nextInt();

        System.out.print("Digite o expoente (número inteiro): ");
        int expoente = scanner.nextInt();

        double potencia = Math.pow(base, expoente); // Calcula a potência
        
        System.out.printf("%d elevado a %d é: %.2f\n", base, expoente, potencia);

        scanner.close();
    }
}   