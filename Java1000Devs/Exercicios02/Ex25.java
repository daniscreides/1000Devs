//Construir um programa que leia um valor numérico inteiro e apresente como resultado os seus valores sucessor e antecessor.

import java.util.Scanner;
public class Ex25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor numérico inteiro: ");
        int valor = scanner.nextInt();

        int antecessor = valor - 1; // Calcula o antecessor
        int sucessor = valor + 1;   // Calcula o sucessor

        System.out.printf("O antecessor de %d é %d e o sucessor é %d.\n", valor, antecessor, sucessor);
        
        scanner.close();
    }
}