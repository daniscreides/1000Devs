//Um empresa resolveu dar um aumento de salário aos seus colaboradores e lhe contraram para desenvolver o programa que calcularáos reajustes. Faça um programa que recebe o salário de um colaborador e faça o reajuste segundo o seguinte critério, baseado no salário atual:
//- salários até R$ 280,00 (incluindo) : aumento de 20%
//- salários entre R$ 280,00 e R$ 700,00: aumento de 15%
//- salários entre R$ 700,00 e R$ 1500,00: aumento de 10%
//- salários de R$ 1500,00 em diante: aumento de 5%
//Após o aumento ser realizado, informe na tela:
//- o salário antes do reajuste;
//- o percentual de aumento aplicado;
//- o valor do aumento;
//- o novo salário, após o aumento.


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);        

        double salarioAtual = 0;

        try {
            System.out.print("Digite o salário atual do funcionário: ");
            salarioAtual = scanner.nextDouble();

        } catch (Exception e) {
            System.out.println("ERRO: Formato inválido! Use apenas números.");
            scanner.close();

            return;
        }
            
            double reajuste = 0;

        if (salarioAtual < 280.00f) {
            reajuste = 0.20f;
            
        } else if (salarioAtual >= 280.00 && salarioAtual < 700.00) {
            reajuste = 0.15f;

        } else if (salarioAtual >= 700.00 && salarioAtual < 1500.00) {
            reajuste = 0.10f;

        } else {
            reajuste = 0.05f;
        }

        double salarioNovo = salarioAtual + (salarioAtual * reajuste);
        double valorAumento = salarioNovo - salarioAtual;

        System.out.printf("\nSalário antes do aumento: R$ %.2f", salarioAtual);
        System.out.printf("\nPercentual de aumento: %.0f%%", reajuste * 100);
        System.out.printf("\nValor do aumento: R$ %.2f", valorAumento);
        System.out.printf("\nNovo salário: R$ %.2f\n", salarioNovo);
            
    scanner.close();

    }
}
