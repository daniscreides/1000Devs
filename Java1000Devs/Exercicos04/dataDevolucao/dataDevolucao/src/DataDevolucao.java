import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DataDevolucao {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos dias deseja pegar o livro emprestado? ");
        int dias = sc.nextInt();

        // Data atual
        LocalDate dataAtual = LocalDate.now();

        // Soma dos dias
        LocalDate dataDevolucao = dataAtual.plusDays(dias);

        // Formatação dd/MM/yyyy
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Data de devolução: " + dataDevolucao.format(formato));

        sc.close();
    }
}
