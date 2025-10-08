// Você deve desenvolver um pequeno programa em Java que ajude estudantes a calcular a média de duas notas de uma disciplina. O programa deve: Solicitar ao usuário que digite duas notas (valores decimais) de 0 a 10. Realizar o cálculo da média aritmética dessas notas. Exibir a média calculada com duas casas decimais. Utilizar try-catch para garantir que: O usuário digitou valores numéricos válidos. Não ocorrerão erros de execução caso ele digite algo inválido (por exemplo, letras em vez de números). Regras adicionais: Caso o usuário insira um valor inválido (como texto não numérico), exiba uma mensagem amigável informando o erro e peça que ele execute o programa novamente. Não é necessário validar se a nota está entre 0 e 10 neste exercício (apenas o tipo do dado).

import java.util.Scanner;
public class App {
    public static void main (String[]args) {
        Scanner scanner = new Scanner(System.in);
        double nota1, nota2, media;

        try {
            System.out.print("Digite a primeira nota: ");
            
            nota1 = scanner.nextDouble();

            System.out.print("Digite a segunda nota: ");
            nota2 = scanner.nextDouble();

            media = (nota1 + nota2) / 2;
            System.out.printf("A média é: %.2f%n", media);

        } catch (Exception e) {
            System.out.println("Erro: Por favor, insira um número válido!");
        }

        scanner.close();
    }
}