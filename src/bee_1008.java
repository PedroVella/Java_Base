import java.util.Scanner;

/*
Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora
 e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
 */

public class bee_1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, hrs;
        double valorHora, salario;

        System.out.println("Digite o numero do funcionario: ");
        num = sc.nextInt();
        System.out.println("Digite o numero de horas trabalhadas: ");
        hrs = sc.nextInt();
        System.out.println("Digite o valor que o funcionario recebe por hora trabalhada: ");
        valorHora = sc.nextDouble();

    salario = (hrs * valorHora);

        System.out.println("NUMERO = " + num);
        System.out.printf("SALARIO = R$ %.2f \n", salario);


    }
}
