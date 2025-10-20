//Faça um programa que parte os 3 lados de um triângulo. O programa deve informar se os valores podem ser um triângulo. Caso seja um triângulo indicado o tipo do triângulo: equilátero, isósceles ou escaleno. Dicas:
//- Para saber se é um triângulo: Cada lado individual deve ser menor que a soma dos outros dois lados que restaram. Você deve validar cada lado satisfeito deste creitério.
//- Triângulo Equilátero: três lados iguais;
//- Triângulo Isósceles: quaisquer dois lados iguais;
//- Triângulo Escaleno: três lados diferentes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double lado1 = 0, lado2 = 0, lado3 = 0;
        boolean entradaValida = false;

        while (!entradaValida) {

            try {
                System.out.print("Digite o primeiro lado: ");
                lado1 = scanner.nextDouble();

                System.out.print("Digite o segundo lado: ");
                lado2 = scanner.nextDouble();

                System.out.print("Digite o terceiro lado: ");
                lado3 = scanner.nextDouble();

                entradaValida = true;

            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite apenas números.");
                scanner.nextLine();
            }
        }

        if ((lado1 < lado2 + lado3) && (lado2 < lado1 + lado3) && (lado3 < lado1 + lado2)) {

            System.out.println("\nOs valores podem formar um triângulo.");

            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Tipo: Triângulo Equilátero");

            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Tipo: Triângulo Isósceles");
                
            } else {
                System.out.println("Tipo: Triângulo Escaleno");
            }

        } else {
            System.out.println("\nOs valores informados NÃO podem formar um triângulo.");
        }

        scanner.close();
    }
}
