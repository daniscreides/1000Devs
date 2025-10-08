package Exercicios01;
import java.util.Scanner;

public class Calculadora {
    
    public static void main(String[] args) {
        Scanner calculadora = new Scanner(System.in);
        
        float numero1;
        char operador; 
        float numero2;
        float resultado = 0;

        System.out.print("Digite o número: ");
        numero1 = calculadora.nextInt();

        System.out.print("Digite o operador: ");
        operador = calculadora.next().charAt(0);

        System.out.print("Digite o número: ");
        numero2 = calculadora.nextInt();

        if (operador == '+') {
            resultado = numero1 + numero2;
            System.out.println("O resultado é: " + resultado);
        } else if (operador == '-') {
            resultado = numero1 - numero2;
            System.out.println("O resultado é: " + resultado);
        } else if (operador == '*') {
            resultado = numero1 * numero2;
            System.out.println("O resultado é: " + resultado);
        } else if (operador == '/') {
            if(numero2 == 0){
                System.out.println("Erro: Divisão por zero não é permitida.");
            }
            else{
                resultado = numero1 / numero2;
                if (resultado == (int) resultado) {
                    System.out.println("O resultado é: " + (int) resultado );
                }
                else{
                    System.out.println("O resultado é: " + resultado);
                }
            }
        } else {
            System.out.println("Operador inválido.");
        } 
                
        calculadora.close();
    }
}