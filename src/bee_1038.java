import java.util.Scanner;

/*
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item.
A seguir, calcule e mostre o valor da conta a pagar.
 */

public class bee_1038 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cod, qnt;
        double total;

        System.out.println("Digite o codigo do produto: ");
        cod = sc.nextInt();
        System.out.println("Digite a quantidade do produto: ");
        qnt = sc.nextInt();

        if (cod == 1) {
            total = qnt * 4.0;
        }
        else if (cod == 2) {
            total = qnt * 4.50;
        }
        else if (cod == 3) {
            total = qnt * 5.0;
        }
        else if (cod == 4) {
            total = qnt * 2.0;
        }
        else {
            total = qnt * 1.5;
        }

        System.out.printf("Total: R$ %.2f",total);
    }
}
