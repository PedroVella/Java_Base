import java.util.Scanner;

/*
Faça um algoritmo para ler um número indeterminado de dados, contendo cada um, a idade de um indivíduo.
O último dado, que não entrará nos cálculos, contém o valor de idade negativa. Calcular e imprimir a idade média
deste grupo de indivíduos.
 */

public class bee_1154 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade, soma = 0;
        int cont = 0;

        System.out.println("Digite a primeira idade:");
        idade = sc.nextInt();

        while (idade >= 0){

            cont += 1;
            soma += idade;
            System.out.println("Digite a outra idade");
            idade = sc.nextInt();
        }

        double media = (double) soma / cont;

        System.out.printf("%.2f%n", media);
    }
}
