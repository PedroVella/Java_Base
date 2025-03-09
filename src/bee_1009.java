import java.util.Scanner;

/*
Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês
(em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber
no final do mês, com duas casas decimais.
 */

public class bee_1009 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        double salario, venda, total;

        System.out.println("Digite o nome do vendedor: ");
        nome = sc.next();
        System.out.println("Digite o salário do vendedor: ");
        salario = sc.nextDouble();
        System.out.println("Digite o valor de vendas dessa vendedor: ");
        venda = sc.nextDouble();

        total = salario + venda * 0.15;

        System.out.printf("TOTAL DO SALARIO DO %s = R$ %.2f \n",nome, total);

    }
}
