//Elaborar um programa que calcule uma raiz de base qualquer com índice qualquer.

import java.util.Scanner;
public class Ex24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        
        System.out.print("Digite o número (base): ");
        double base = scanner.nextDouble();

        System.out.print("Digite o índice da raiz: ");
        double indice = scanner.nextDouble();

        double raiz = Math.pow(base, 1.0 / indice); // Calcula a raiz
        System.out.printf("A raiz de índice %.2f de %.2f é: %.2f\n", indice, base, raiz);

        scanner.close();
    }   
}
