import java.util.Scanner;

/*
Faço um programa para ler um número indeterminado de dados contendo cada um a idade de um indivíduo.
O último dado que não entrará nos cálculos contém um valor de idade negativa. Calcular e imprimir a
idade média desse grupo de indivíduos. Se for entrado um valor negativo na primeira vez, mostrado a
mensagem "impossível calcular."
 */

public class Ex_While {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a idade: ");
        int idade = sc.nextInt();
        int soma = 0;
        int cont = 0;

        while (idade >= 0){
            soma = soma + idade;
            cont = cont + 1;

            idade = sc.nextInt();
        }

        if (cont > 0){
            double media = (double) soma / cont;
            System.out.printf("MEDIA: %.2f \n", media);
        }
        else {
            System.out.println("Impossivel calcular");
        }
    }
}
