import java.util.Scanner;

/*
Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua ajuda para organizar
os experimentos de um laboratório o qual ela é responsável. Ela quer saber no final do ano, quantas cobaias foram
utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada.

Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos. Para obter estas informações,
ela sabe exatamente o número de experimentos que foram realizados, o tipo de cobaia utilizada e a quantidade
de cobaias utilizadas em cada experimento.
 */

public class bee_1094 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a a quantidade de casos: ");
        int n = sc.nextInt();


        int coelho = 0;
        int rato = 0;
        int sapo = 0;
        int total = 0;
        int i;

        for (i = 0; i < n; i++) {

            System.out.print("Digite a quantidade de cobaias e depois com espaçamento a inicial delas do experimento " + (i + 1) + ": ");
            int qnt = sc.nextInt();
            int cobaia = sc.next().charAt(0);

            total += qnt;

            if (cobaia == 'c') {

                coelho += qnt;
            }
            else if (cobaia == 's') {

                sapo += qnt;
            }
            else if (cobaia == 'r') {

                rato += qnt;
            }

        }

        double porcentagemCoelhos = (double) coelho / total * 100.0;
        double porcentagemRatos = (double) rato / total * 100.0;
        double porcentagemSapos = (double) sapo / total * 100.0;

        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + coelho);
        System.out.println("Total de ratos: " + rato);
        System.out.println("Total de sapos: " + sapo);
        System.out.printf("Percentual de coelhos: %.2f %% \n", porcentagemCoelhos);
        System.out.printf("Percentual de ratos: %.2f %% \n", porcentagemRatos);
        System.out.printf("Percentual de sapos: %.2f %% \n", porcentagemSapos);

    }
}
