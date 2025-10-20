import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro menor que 1000: ");
        int numero = scanner.nextInt();

        if (numero < 1 || numero >= 1000) {
            System.out.println("Número inválido! Digite entre 1 e 999.");

        } else {
            
            int centenas = numero / 100;
            int resto = numero % 100;

            int dezenas = resto / 10;
            int unidades = resto % 10;

            String resultado = "";

            // Centenas
            if (centenas > 0) {
                resultado += centenas + (centenas == 1 ? " centena" : " centenas");
            }

            // Dezenas
            if (dezenas > 0) {
                if (!resultado.isEmpty()) {
                    if (unidades > 0) {
                        resultado += ", ";
                    } else {
                        resultado += " e ";
                    }
                }
                resultado += dezenas + (dezenas == 1 ? " dezena" : " dezenas");
            }

            // Unidades
            if (unidades > 0) {
                if (!resultado.isEmpty()) {
                    resultado += " e ";
                }
                resultado += unidades + (unidades == 1 ? " unidade" : " unidades");
            }

            System.out.println(numero + " = " + resultado);
        }

        scanner.close();
    }
}
