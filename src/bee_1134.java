import java.util.Scanner;

/*
Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes.
Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina
3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código
(até que seja válido). O programa será encerrado quando o código informado for o número 4.
 */

public class bee_1134 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gasolina = 0;
        int alcool = 0;
        int diesel = 0;

        System.out.println("Digite qual o número do produto que voce mais gosta: ");
        int num = sc.nextInt();

        while (num != 4){

            if (num == 1){
                alcool += 1;
            }
            else if (num == 2) {
                gasolina += 1;
            }
            else if (num == 3) {
                diesel += 1;
            }
            else {
                System.out.println("Digite um número valido");
            }
            System.out.println("\nDigite qual o número do produto que voce mais gosta: ");
            num = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }
}
