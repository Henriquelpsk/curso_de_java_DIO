import java.util.Arrays;
import java.util.Scanner;

public class MaiorAndMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maiorNumero = 0;
        int mediaNumero = 0;

        for (int x = 1; x <= 5; x++) {
            System.out.println("Digite um número");
            int numero = sc.nextInt();
            mediaNumero += numero;
            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }
        mediaNumero = mediaNumero / 5;
        System.out.println("----------------------------------------");
        System.out.println("O maior número é: " + maiorNumero);
        System.out.println("A média dos números é: " + mediaNumero);
    }
}
