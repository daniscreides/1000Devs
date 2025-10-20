import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o valor do saque (mínimo R$10 e máximo R$600): ");
            int valor = scanner.nextInt();

            if (valor < 10 || valor > 600) {
                System.out.println("Valor inválido! O saque deve ser entre R$10 e R$600.");
            } else {
                int nota100 = valor / 100;
                valor %= 100;

                int nota50 = valor / 50;
                valor %= 50;

                int nota10 = valor / 10;
                valor %= 10;

                int nota5 = valor / 5;
                valor %= 5;

                int nota1 = valor;

                System.out.println("\n--- Notas fornecidas ---");
                if (nota100 > 0) System.out.println(nota100 + " nota(s) de R$100");
                if (nota50 > 0)  System.out.println(nota50 + " nota(s) de R$50");
                if (nota10 > 0)  System.out.println(nota10 + " nota(s) de R$10");
                if (nota5 > 0)   System.out.println(nota5 + " nota(s) de R$5");
                if (nota1 > 0)   System.out.println(nota1 + " nota(s) de R$1");
            }

        } catch (Exception e) {
            System.out.println("Entrada inválida! Digite apenas números inteiros.");
        } finally {
            scanner.close();
        }
    }
}

