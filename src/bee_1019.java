import java.util.Scanner;

/*
Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o
expresso no formato horas:minutos:segundos.
 */

public class bee_1019 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, resto, horas, minutos, segundos;

        System.out.println("Digite a quantidade de segundos: ");
        N = sc.nextInt();

        horas = N / 3600;
        resto = N % 3600;
        minutos = resto / 60;
        segundos = resto % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);

    }
}
