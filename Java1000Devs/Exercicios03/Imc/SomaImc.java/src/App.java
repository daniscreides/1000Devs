import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double peso = 0;
        double altura = 0;

        System.out.println("CALCULADORA DE IMC \n");

        while (true) {
            try {
                System.out.print("Digite seu peso em kg: ");
                peso = Double.parseDouble(scanner.nextLine().replace(",", "."));
                if (peso <= 0) {
                    System.out.println("Peso inválido. Digite um valor maior que zero.\n");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite um número válido para o peso.\n");
            }
        }
        while (true) {
            try {
                System.out.print("Digite sua altura em metros: ");
                altura = Double.parseDouble(scanner.nextLine().replace(",", "."));
                if (altura <= 0) {
                    System.out.println("Altura inválida. Digite um valor maior que zero.\n");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite um número válido para a altura.\n");
            }
        }
        double imc = peso / (altura * altura);

        String classificacao;
        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc < 25.0) {
            classificacao = "Peso normal";
        } else if (imc < 30.0) {
            classificacao = "Sobrepeso";
        } else if (imc < 35.0) {
            classificacao = "Obesidade grau I";
        } else if (imc < 40.0) {
            classificacao = "Obesidade grau II";
        } else {
            classificacao = "Obesidade grau III (mórbida)";
        }

        System.out.println("\n===== RESULTADO =====");
        System.out.printf("IMC: %.2f\n", imc);
        System.out.println("Classificação: " + classificacao);
        System.out.println("=====================");

        scanner.close();
    }
}