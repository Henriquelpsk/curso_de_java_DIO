import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculo de fatorial");
        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();
        int fatorial = 1;

        for(int x=0;x<numero;numero--){
            fatorial = fatorial * numero;
        }
        System.out.println("O fatorial é " + fatorial);
    }
}
