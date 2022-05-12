import java.util.Scanner;

public class ImparPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de números que deseja: ");
        int qtdNumeros = sc.nextInt();
        int qtdPares = 0;
        int qtdImpares = 0;

        int contador = 0;
        do{
            System.out.println("Digite o número: ");
            int numero = sc.nextInt();

            if(numero % 2 == 0){
                qtdPares += 1;
            } else {
                qtdImpares +=1;
            }
            contador ++;

        } while (contador < qtdNumeros);
        System.out.println("A quantidade de números pares é: " + qtdPares);
        System.out.println("A quantidade de números impares é: " + qtdImpares);
    }
}
