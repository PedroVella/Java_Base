import java.util.Scanner;

/*
Calcule o consumo médio de um automóvel sendo fornecidos a distância total percorrida (em Km)
e o total de combustível gasto (em litros).
 */

public class bee_1014 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int KM, comb;
        double KM_L;

        System.out.println("Digite a distancia total percorrida em KM: ");
        KM = sc.nextInt();
        System.out.println("Digite o combustivel gasto: ");
        comb = sc.nextInt();

        KM_L = (double) KM / comb;

        System.out.printf("%.3f km/l", KM_L);

    }
}
