package Exercicios01;
import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        
        String nomeUsuario;
        String sobrenomeUsuario;
        String nomeMae;
        String nomePai;
        int idadeUsuario;
        
        System.out.print("Digite seu nome: ");
        nomeUsuario = leitura.nextLine();

        System.out.print("Digite seu sobrenome: ");
        sobrenomeUsuario = leitura.nextLine();

        System.out.print("Digite o nome da sua mãe: ");
        nomeMae = leitura.nextLine();

        System.out.print("Digite o nome do seu pai: ");
        nomePai = leitura.nextLine();

        System.out.print("Digite sua idade: ");
        idadeUsuario = leitura.nextInt();
        
        System.out.println("Olá, " + nomeUsuario + ". " + "Você tem " + idadeUsuario + " anos. E seus pais são " + nomeMae + " e " + nomePai + ".");
        
        leitura.close();
    }
}