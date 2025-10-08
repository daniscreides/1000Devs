//Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz 12 quilômetros por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto (variável TEMPO) e a velocidade média (variável VELOCIDADE) durante a viagem. Desta forma, será possível obter a distância percorrida com a fórmula DISTÂNCIA +-- TEMPO * VELOCIDADE. A partir do valor da distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a fórmula LITROS_USADOS +-- DISTÂNCIA/ 12. O programa deve apresentar os valores da velocidade média, tempo gasto na viagem, a distância percorrida e a quantidade de litros utilizada na viagem.

import java.util.Scanner;
public class Ex4 { 
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tempo gasto na viagem (em horas): ");
        double tempo = scanner.nextDouble();
        
        System.out.print("Digite a velocidade média durante a viagem (em km/h): ");
        
        double velocidade = scanner.nextDouble();
        double distancia = tempo * velocidade;
        double litrosUsados = distancia / 12;
        
        System.out.printf("Velocidade média: %.2f km/h%n", velocidade);
        System.out.printf("Tempo gasto na viagem: %.2f horas%n", tempo);
        System.out.printf("Distância percorrida: %.2f km%n", distancia);
        System.out.printf("Quantidade de litros utilizada na viagem: %.2f litros%n", litrosUsados);
        
        scanner.close();
    }
}