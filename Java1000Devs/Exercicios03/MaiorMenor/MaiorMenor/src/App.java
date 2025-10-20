import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        try {
            
            System.out.print("Digite o primeiro número: ");
            int num1 = teclado.nextInt();

            System.out.print("Digite o segundo número: ");
            int num2 = teclado.nextInt();

            System.out.print("Digite o terceiro número: ");
            int num3 = teclado.nextInt();

            int maior, menor;

            // Maior número
            if (num1 >= num2 && num1 >= num3) {
                maior = num1;

            } else if (num2 >= num1 && num2 >= num3) {
                maior = num2;

            } else {
                maior = num3;
            }

            // Menor número
            if (num1 <= num2 && num1 <= num3) {
                menor = num1;
            } else if (num2 <= num1 && num2 <= num3) {
                menor = num2;
            } else {
                menor = num3;
            }

            System.out.println("\nMaior número: " + maior);
            System.out.println("Menor número: " + menor);

        } catch (Exception e) {
            System.out.println("\nErro: Digite apenas números inteiros!");

        }

        teclado.close();
    }
}

