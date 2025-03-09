import java.util.Scanner;

/*
Leia 100 valores inteiros. Apresente então o maior valor lido e a posição dentre os 100 valores lidos.
 */

public class bee_1080 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int maior = sc.nextInt();
        int posicao = 1;

        for (int i = 2; i <= 100; i++){

            System.out.print("Digite outro numero: ");
            int x = sc.nextInt();

            if (x > maior){
                maior = x;
                posicao = i;
            }
        }

        System.out.println("Maior: " + maior);
        System.out.println("Posição: " + posicao);

        sc.close();
    }
}
