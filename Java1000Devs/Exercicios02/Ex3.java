//Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula VOLUME +-- 3.14159 *Ri 2 * ALTURA.
    
import java.util.Scanner;
public class Ex3 { 
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o raio da lata de óleo: ");

        double raio = scanner.nextDouble();
        System.out.print("Digite a altura da lata de óleo: ");

        double altura = scanner.nextDouble();
        double volume = 3.14159 * Math.pow(raio, 2) * altura;

        System.out.printf("O volume da lata de óleo é: %.2f%n", volume);
        
        scanner.close();
    }
}