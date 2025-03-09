import java.util.Scanner;

/*
Fazer um programa para ler o nome (apenas uma palavra) e idade de duas pessoas. Ao final mostrar uma mensagem com os
nomes e a idade média entre essas pessoas, com uma casa decimal.
 */

public class Ex_String_Casting {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome 1: ");
        String nome1 = sc.next();
        System.out.println("Digite a idade da pessoa 1: ");
        int idade1 = sc.nextInt();
        System.out.println("Digite o nome 2: ");
        String nome2 = sc.next();
        System.out.println("Digite a idade da pessoa 2: ");
        int idade2 = sc.nextInt();

        double media = (double) (idade1 + idade2) / 2;

        System.out.printf("A idade media de %s e %s é de %.1f anos", nome1, nome2, media);



    }
}
