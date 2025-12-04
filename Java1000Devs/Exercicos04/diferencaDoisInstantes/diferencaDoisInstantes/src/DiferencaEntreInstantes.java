import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DiferencaEntreInstantes {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // Formato esperado
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        System.out.print("Digite a primeira data e hora (dd/MM/yyyy HH:mm:ss): ");
        String entrada1 = sc.nextLine();

        System.out.print("Digite a segunda data e hora (dd/MM/yyyy HH:mm:ss): ");
        String entrada2 = sc.nextLine();

        // Conversão para LocalDateTime
        LocalDateTime dataHora1 = LocalDateTime.parse(entrada1, formato);
        LocalDateTime dataHora2 = LocalDateTime.parse(entrada2, formato);

        // Calcula a diferença usando Duration
        Duration duracao = Duration.between(dataHora1, dataHora2);

        // Pega valores absolutos para exibir
        long totalSegundos = Math.abs(duracao.getSeconds());
        long dias = totalSegundos / 86400;               // 24 * 60 * 60
        long horas = (totalSegundos % 86400) / 3600;
        long minutos = (totalSegundos % 3600) / 60;
        long segundos = totalSegundos % 60;

        // Exibição da diferença
        System.out.println("\n--- Diferença entre os dois instantes ---");
        System.out.println("Dias: " + dias);
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);

        // Comparação das duas datas
        System.out.println("\n--- Comparação ---");
        if (dataHora1.isAfter(dataHora2)) {
            System.out.println("A primeira data é mais recente.");
        } else if (dataHora1.isBefore(dataHora2)) {
            System.out.println("A segunda data é mais recente.");
        } else {
            System.out.println("As duas datas são exatamente iguais.");
        }

        sc.close();
    }
}
