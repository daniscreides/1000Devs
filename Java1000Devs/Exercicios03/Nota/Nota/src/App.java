//Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre, e calcule a sua média apresentando na tela qual o conceito obtido. A atribuição de conceitos obedece à tabela abaixo:
//Média de Aproveitamento
//Intervalo dos Valores Conceito
//Entre 9 e 10 A
//Entre 7,5 e 9 B
//Entre 6 e 7,5 C
//Entre 4 e 6 D
//Entre 0 e 4 E


import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner (System.in);

        try {
            System.out.println("Primeira nota: ");
            double nota1 = scanner.nextDouble();

            System.out.println("Segunda nota: ");
            double nota2 = scanner.nextDouble();

            double resultado = (nota1 + nota2) / 2;

        if (resultado >= 9 && resultado <= 10) {
            System.out.println("Nota A");    

        } else if (resultado >= 7.5 && resultado < 9) {
            System.out.println("Nota B"); 
            
        } else if (resultado >= 6 && resultado < 7.5) {
            System.out.println("Nota C"); 
            
        } else if (resultado >= 4 && resultado < 6) {
            System.out.println("Nota D"); 
            
        } else if (resultado >= 0 && resultado < 4) {
            System.out.println("Nota E"); 
            
        } else {
            System.out.println("Nota inválida!");
        }       

        } catch (Exception e) {
            System.out.println("ERRO: Digite apenas números!");
        }      

         scanner.close();        

    }
}
