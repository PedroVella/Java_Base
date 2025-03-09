import java.util.Scanner;

/*
Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um terceiro vetor C onde
cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima o vetor C gerado.
 */

public class bee_vetor3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de N: ");
        int n = sc.nextInt();

        int [] vetA = new int[n];
        int[] vetB = new int[n];
        int[] vetC = new int[n];

        for (int i = 0; i < n; i++){

            System.out.println("Digite o valor de A" + (i + 1) + ": ");
            vetA[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++){

            System.out.println("Digite o valor de B" + (i + 1) + ": ");
            vetB[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++){

            vetC[i] = vetA[i] + vetB[i];
        }
        for (int soma : vetC){
            System.out.print(soma + " ");
        }
    }
}
