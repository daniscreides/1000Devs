import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        try {
            System.out.print("Digite o dia: ");
            int dia = teclado.nextInt();

            System.out.print("Digite o mês: ");
            int mes = teclado.nextInt();

            System.out.print("Digite o ano: ");
            int ano = teclado.nextInt();

            boolean dataValida = true;

            // Verifica se o mês é válido
            if (mes < 1 || mes > 12) {
                dataValida = false;
            } else {
                int diasNoMes = 0;

                // Meses com 31 dias
                if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                    diasNoMes = 31;
                } 
                // Meses com 30 dias
                else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                    diasNoMes = 30;
                } 
                // Fevereiro (verifica se é bissexto)
                else if (mes == 2) {
                    if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
                        diasNoMes = 29; // Bissexto
                    } else {
                        diasNoMes = 28;
                    }
                }

                // Verifica se o dia está dentro do intervalo permitido
                if (dia < 1 || dia > diasNoMes) {
                    dataValida = false;
                }
            }

            // Resultado final
            if (dataValida) {
                System.out.println("A data " + dia + "/" + mes + "/" + ano + " é válida.");
            } else {
                System.out.println("A data " + dia + "/" + mes + "/" + ano + " é inválida.");
            }

        } catch (Exception e) {
            System.out.println("Entrada inválida! Digite apenas números inteiros.");
        } finally {
            teclado.close();
        }
    }
}
