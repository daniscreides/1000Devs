//Ler uma temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius. A fórmula de conversão é C +-- ((F - 32) * 5) / 9, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.

import java.util.Scanner;
public class Ex2 { 
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em Fahrenheit: ");

        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        
        System.out.printf("A temperatura em Celsius é: %.2f°C%n", celsius);
        scanner.close();
    }
}