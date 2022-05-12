import java.util.Random;

/**
 * Programa que le 20 números aleatórios entre 0 e 100 e no final mostra os números
 */
public class NumeroAleatorio {
    public static void main(String[] args) {
        Random random = new Random();

        int[]numeros = new int[20];

        for(int i = 0;i < numeros.length; i++){
            int numero = random.nextInt(100);
            numeros[i] = numero;
        }

        System.out.println("Números aleatórios");

        for(int numero : numeros){
            System.out.print(numero + " ");
        }
    }
}
