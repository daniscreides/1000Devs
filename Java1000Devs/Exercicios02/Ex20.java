//Construir um programa que calcule e apresente em metros por segundo o valor da velocidade de um projétil que percorre uma distância em quilômetros a um espaço de tempo em minutos. Utilize a fórmula VELOCIDADE+- (DISTÂNCIA* 1000) /(TEMPO* 60).

import java.util.Scanner;
public class Ex20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distância percorrida em quilômetros: ");
        double distanciaKm = scanner.nextDouble();

        System.out.print("Digite o tempo gasto em minutos: ");
        double tempoMin = scanner.nextDouble();

        double distanciaM = distanciaKm * 1000; // Converte quilômetros para metros
        double tempoS = tempoMin * 60; // Converte minutos para segundos
        double velocidade = distanciaM / tempoS; // Calcula a velocidade em metros por segundo
        
        System.out.printf("A velocidade do projétil é: %.2f metros por segundo\n", velocidade);

        scanner.close();
    }
}