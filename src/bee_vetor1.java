import java.util.Scanner;

/*
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela o maior número
do vetor (supor não haver empates). Mostrar também a posição do maior elemento.
 */

public class bee_vetor1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de N: ");
        int n = sc.nextInt();
        double[] vet = new double[n];

        for (int i = 0; i < n; i++){

            System.out.println("Digite um valor: ");
            vet[i] = sc.nextDouble();
        }

        int posicao = 0;
        double maior = 0;

        for (int i = 0; i < n; i++){


            if (vet[i] > maior){
                maior = vet[i];
                posicao = (i + 1);
            }
        }

        System.out.println("Maior: " + maior);
        System.out.println("Posição: " + posicao);
    }
}
