//Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é F +-- (9 * C+ 160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble(); // lê o valor primeiro

        double fahrenheit = (9 * celsius + 160) / 5; // calcula depois

        System.out.println(celsius + " graus Celsius é igual a " + fahrenheit + " graus Fahrenheit.");

        scanner.close();
    }
}
