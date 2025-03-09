import java.util.Scanner;

/*
Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno. A seguir, calcule a média do aluno,
sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5. Considere que cada nota pode ir de 0 até 10.0,
sempre com uma casa decimal.
 */

public class bee_1006 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double A, B, C, media;

        System.out.println("Digite a nota A do aluno: ");
        A = sc.nextDouble();
        System.out.println("Digite a nota B do aluno: ");
        B = sc.nextDouble();
        System.out.println("Digite a nota C do aluno: ");
        C = sc.nextDouble();

        media = (A * 2 + B * 3 + C * 5) / 10;

        System.out.printf("MEDIA = %.1f \n", media);
    }
}
