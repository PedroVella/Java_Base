import java.util.Scanner;

/*
Vamos lá fazer um programa para ler o número N, depois o nome (apenas uma palavra sem espaços), idade e altura de N pessoas.
Depois, mostrar na tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos.
 */

public class Ex_Vetor3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de N: ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];
        double soma = 0.0;
        int cont = 0;

        for (int i = 0; i < n; i++){

            System.out.println("Digite o nome, idade e altura da pessoa " + (i + 1) + ": ");
            nomes[i] = sc.next();
            idades[i] = sc.nextInt();
            alturas[i] = sc.nextDouble();

            soma += alturas[i];

            if (idades[i] < 16) {
                cont++;
            }
        }

        double media = soma / n;
        double porcentagem = (cont * 100.0) / n;

        System.out.printf("Altura média: %.2f\n", media);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcentagem);

    }
}
