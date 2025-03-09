import java.util.Scanner;

public class bee_1117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota1, nota2;

        System.out.println("Digite a nota 1: ");
        nota1 = sc.nextDouble();

        while (nota1 < 0 || nota1 > 10) {
            System.out.println("Nota Invalida\n");
            System.out.println("Digite a nota 1: ");
            nota1 = sc.nextDouble();
        }

        System.out.println("\nDigite a nota 2: ");
        nota2 = sc.nextDouble();

        while (nota2 < 0 || nota2 > 10){
            System.out.println("Nota invalida\n");
            System.out.println("Digite a nota 2: ");
            nota2 = sc.nextDouble();
        }

        double media = (nota1 + nota2) / 2;

        System.out.printf("media = %.2f", media);
    }
}
