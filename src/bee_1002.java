import java.util.Locale;
import java.util.Scanner;

/*A fórmula para calcular a área de uma circunferência é: area = π . raio2. Considerando para este problema que π = 3.14159:

- Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π. */

public class bee_1002 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        float raio;
        double n, A;
        n = 3.14159;

        System.out.println("Digite o valor do raio: ");
        raio = sc.nextFloat();

        raio = raio * raio;

        A = n * raio;

        System.out.printf("A=%.4f %n", A);

    }

}