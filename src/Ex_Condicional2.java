import java.util.Scanner;

/*
Fazer um programa para levar três números inteiros.
Em seguida mostrar qual o menor dentre os três números lidos em caso de empate mostrando apenas uma

vez.
 */

public class Ex_Condicional2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.println("Digite o valor de A:");
        a = sc.nextInt();
        System.out.println("Digite o valor de B:");
        b = sc.nextInt();
        System.out.println("Digite o valor de C:");
        c = sc.nextInt();

        if (a < b && a < c){
            System.out.println("Menor = " + a);
        }
        else if (b < c) {
            System.out.println("Menor = " + b);
        }
        else {
            System.out.println("Menor = " + c);
        }
    }
}
