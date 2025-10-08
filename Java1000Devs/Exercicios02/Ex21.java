//Elaborar um programa de computador que calcule e apresente o valor do volume de uma esfera. Utilize a fórmula VOLUME +- (4 / 3) * 3.14159 * (RAIO j 3).

import java.util.Scanner;
public class Ex21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio da esfera em metros: ");
        double raio = scanner.nextDouble();

        double volume = (4.0 / 3.0) * 3.14159 * Math.pow(raio, 3); // Calcula o volume da esfera
        
        System.out.printf("O volume da esfera é: %.2f metros cúbicos\n", volume);

        scanner.close();
    }
}