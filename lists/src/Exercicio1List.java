import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Programa que recebe o valor de 6 meses diferentes e calcula a média dizendo quem está acima da média ou não*/
public class Exercicio1List {
    public static void main(String[] args) {

        double media = 0;
        Scanner sc = new Scanner(System.in);
        List<Double> temperaturaList = new ArrayList<>();

        for(int count = 0;count < 6;count ++){
            System.out.println("Digite a temperatura: ");
            double temperatura = sc.nextDouble();
            media += temperatura;
            temperaturaList.add(temperatura);
        }

        media = media / temperaturaList.size();
        System.out.println("A média de temperatura é " + media);

        for (double temp : temperaturaList){
            if (temp > media) {
                System.out.println("Mes " + (temperaturaList.indexOf(temp)+1) + " Acima da temperatura média " + temp);
            } else{
                System.out.println("Mes " + (temperaturaList.indexOf(temp)+1) + " Abaixo da temperatura média " + temp);
            }
        }
    }
}
