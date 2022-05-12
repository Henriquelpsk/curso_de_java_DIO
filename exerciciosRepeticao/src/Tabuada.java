import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero da tabuada que deseja: ");
        int numero = sc.nextInt();

        System.out.println("Tabuada do número " + numero);
        for(int x=1;x<=10;x++){
            System.out.println(numero + "x" + x + "=" + (x*numero));
        }
    }
}
