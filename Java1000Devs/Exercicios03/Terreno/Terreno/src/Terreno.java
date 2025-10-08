import java.util.InputMismatchException;
import java.util.Scanner;

public class Terreno {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int frenteMts = 0;
        int lateralMts = 0;
        float valorMetroQuadrado = 0f;
        float valorTerreno = 0f;

        System.out.println("CÁLCULO DO VALOR DO TERRENO");

        while (true) {
            try {
                System.out.print("Digite a distância da frente do terreno (em metros): ");
                frenteMts = teclado.nextInt();
                if (frenteMts <= 0) {
                    System.out.println("Valor inválido! A frente deve ser maior que zero.");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite um número inteiro válido.");
                teclado.nextLine();
            }
        }
        while (true) {
            try {
                System.out.print("Digite a distância lateral do terreno (em metros): ");
                lateralMts = teclado.nextInt();
                if (lateralMts <= 0) {
                    System.out.println("Valor inválido! A lateral deve ser maior que zero.");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite um número inteiro válido.");
                teclado.nextLine();
            }
        }
        while (true) {
            try {
                System.out.print("Digite o valor do metro quadrado: R$ ");
                valorMetroQuadrado = teclado.nextFloat();
                if (valorMetroQuadrado <= 0) {
                    System.out.println("Valor inválido! O metro quadrado deve ser maior que zero.");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite um número válido (ex: 350.50).");
                teclado.nextLine();
            }
        }
        valorTerreno = frenteMts * lateralMts * valorMetroQuadrado;

        if (frenteMts == lateralMts) {
            valorTerreno = valorTerreno * 1.1f;
        } else {
            valorTerreno = valorTerreno * 0.98f;
        }
        System.out.printf("\nO valor do terreno é: R$ %.2f\n", valorTerreno);

        teclado.close();
    }
}