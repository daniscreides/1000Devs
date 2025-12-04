import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CalculadoraIdadeExata {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // Formato esperado de entrada
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Digite sua data de nascimento (dd/MM/yyyy): ");
        String entrada = sc.nextLine();

        // Converte para LocalDate
        LocalDate nascimento = LocalDate.parse(entrada, formato);
        LocalDate hoje = LocalDate.now();

        // Calcula idade exata
        Period idade = Period.between(nascimento, hoje);

        // Exibe anos, meses e dias
        System.out.println("\n--- Idade Exata ---");
        System.out.println("Anos : " + idade.getYears());
        System.out.println("Meses: " + idade.getMonths());
        System.out.println("Dias : " + idade.getDays());

        // Cálculo do próximo aniversário
        LocalDate proximoAniversario = nascimento.withYear(hoje.getYear());

        // Se o aniversário deste ano já passou, muda para ano seguinte
        if (proximoAniversario.isBefore(hoje) || proximoAniversario.equals(hoje)) {
            proximoAniversario = proximoAniversario.plusYears(1);
        }

        // Quantos dias faltam
        long diasRestantes = java.time.temporal.ChronoUnit.DAYS.between(hoje, proximoAniversario);

        System.out.println("\nDias até o próximo aniversário: " + diasRestantes);

        sc.close();
    }
}
