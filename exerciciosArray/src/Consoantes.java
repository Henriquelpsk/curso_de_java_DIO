import java.util.Scanner;

/**
 * Programa que recebe um vetor de 6 caracteres unicos e separa as concoantes
 */
public class Consoantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] vetor = new String[6];
        int qtdConsoante = 0;
        int contador = 0;

        do {
            System.out.println("Letra: ");
            String letra = sc.next();

            if (!(letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u"))) {
                vetor[contador] = letra;
                qtdConsoante++;
            }
            contador++;
        } while (contador < vetor.length);

        for (String consoante : vetor) {
            if (consoante != null) {
                System.out.print(consoante + " ");
            }
        }
        System.out.printf("A quantidade de consoantes é: " + qtdConsoante);
    }
}
