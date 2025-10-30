import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String cpf;
        int d1, d2, d3, d4, d5, d6, d7, d8, d9;
        int soma1, soma2;
        int resto1, resto2;
        int digito1, digito2;

        System.out.print("Digite seu CPF (somente números): ");
        cpf = scanner.nextLine();

        cpf = cpf.replaceAll("\\D", "");

        if (cpf.length() != 11) {
            System.out.println("CPF deve ter 11 dígitos.");
            scanner.close();
            return;
        }

        d1 = cpf.charAt(0) - 48;
        d2 = cpf.charAt(1) - 48;
        d3 = cpf.charAt(2) - 48;
        d4 = cpf.charAt(3) - 48;
        d5 = cpf.charAt(4) - 48;
        d6 = cpf.charAt(5) - 48;
        d7 = cpf.charAt(6) - 48;
        d8 = cpf.charAt(7) - 48;
        d9 = cpf.charAt(8) - 48;

        soma1 = (d1 * 10) + (d2 * 9) + (d3 * 8) + (d4 * 7) + (d5 * 6) + (d6 * 5) + (d7 * 4) + (d8 * 3) + (d9 * 2);
        resto1 = soma1 % 11;
        digito1 = (resto1 < 2) ? 0 : 11 - resto1;

        soma2 = (d1 * 11) + (d2 * 10) + (d3 * 9) + (d4 * 8) + (d5 * 7) + (d6 * 6) + (d7 * 5) + (d8 * 4) + (d9 * 3) + (digito1 * 2);
        resto2 = soma2 % 11;
        digito2 = (resto2 < 2) ? 0 : 11 - resto2;

        int digitoInformado1 = cpf.charAt(9) - 48;
        int digitoInformado2 = cpf.charAt(10) - 48;

        if (digito1 == digitoInformado1 && digito2 == digitoInformado2) {
            System.out.println("CPF válido!");
        } else {
            System.out.println("CPF inválido!");
        }

        scanner.close();
    }
}
