import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio2List {
    public static void main(String[] args) {

        int qtdSim = 0;
        Scanner sc = new Scanner(System.in);
        List<String> boolList = new ArrayList<>();

        System.out.println("Telefonou para a vitima? ");
        String resp1 = sc.next();
        System.out.println("Esteve no local do crime? ");
        String resp2 = sc.next();
        System.out.println("Mora perto da vítima? ");
        String resp3 = sc.next();
        System.out.println("Devia para a vítima? ");
        String resp4 = sc.next();
        System.out.println("Já trabalhou com a vítima? ");
        String resp5 = sc.next();
        Collections.addAll(boolList,resp1,resp2,resp3,resp4,resp5);

        for(String resposta : boolList){
            if(resposta.equalsIgnoreCase("s")){
                qtdSim += 1;
            }
        }

        if(qtdSim == 2){
            System.out.println("Pessoa Suspeita");
        }else if(qtdSim == 3 || qtdSim == 4){
            System.out.println("Pessoa Cumplice");
        }else if(qtdSim == 5){
            System.out.println("Pessoa Culpada");
        }else {
            System.out.println("Pessoa Inocente");
        }
    }
}
