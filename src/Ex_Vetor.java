import java.util.Scanner;

/*
Faça um programa que leia N números inteiros e armazene os de um vetor.
Em seguida, mostrar na tela todos os números negativos lidos.
 */

public class Ex_Vetor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de N: ");
        int N = sc.nextInt();
        int[] vet = new int[N];

        for (int i = 0; i < N; i++){

            System.out.println("Digite um valor: ");
            vet[i] = sc.nextInt();

        }
        for (int i = 0; i < N; i++){

            if (vet[i] < 0){
                System.out.println(vet[i]);
            }
        }
    }
}
