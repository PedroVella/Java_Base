import java.util.Scanner;

/*
Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”.
 */

public class bee_1013 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a, b, c, maior1, maior2;

        System.out.println("Digite o valor de A: ");
        a = sc.nextInt();
        System.out.println("Digite o valor de B: ");
        b = sc.nextInt();
        System.out.println("Digite o valor de C: ");
        c = sc.nextInt();

        maior1 = (a + b + Math.abs(a - b)) / 2;
        maior2 = (maior1 + c + Math.abs(maior1 - c)) / 2;

        System.out.println(maior2 + " eh o maior");

    }
}
