import java.util.Scanner;

public class nota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Digite o valor da nota: ");
            int nota = sc.nextInt();
            if (nota >= 0 && nota <= 10) {break;} ;
            System.out.println("Erro! O valor precisa estar entre 0 e 10");
        } ;
    }
}
