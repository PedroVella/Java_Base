import java.util.Scanner;

/*
Fazer um programa para liberar as duas notas que um aluno obteve no primeiro e segundo semestres de uma disciplina anual.
Em seguida mostrar a nota final que o aluno obteve no ano juntamente com um texto explicativo.Caso a nota do aluno seja
inferior a 60 mostrará a mensagem reprovado.
 */

public class Ex_Condicional {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1, nota2;

        System.out.println("Digite a nota 1: ");
        nota1 = sc.nextDouble();
        System.out.println("Digite a nota 2: ");
        nota2 = sc.nextDouble();

        double notaFinal = nota1 + nota2;
        System.out.printf("NOTA FINAL = %.1f \n", notaFinal);

        if (notaFinal < 60) {
            System.out.println("REPROVADO");

        }

    }
}
