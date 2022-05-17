import java.io.ObjectOutputStream;
import java.util.*;

public class ExercicioMap {
    public static void main(String[] args) {

        Map<String, Integer> estados = new LinkedHashMap<>(){{
            put("PE",9616621);
            put("AL",3351543);
            put("CE",9187103);
            put("RN",3534265);
        }};
        estados.put("RN",3534165);

        if(estados.containsKey("PB")){
            System.out.println("ok");
        }else {
            estados.put("PB",4039277);
        }
        System.out.println("População de pernambuco " + estados.get("PB"));
        System.out.println("");

        System.out.println("Estados ordenados por valores informados");
        Set<Map.Entry<String, Integer>> entries = estados.entrySet();
        for(Map.Entry<String, Integer> entry : entries){
            System.out.println(entry);
        }
        System.out.println("");

        System.out.println("Estados ordenados por ordem alfabética");
        Map<String, Integer> estadosPorNome = new TreeMap<>(estados);
        for (Map.Entry<String, Integer> entry : estadosPorNome.entrySet()){
            System.out.println(entry);
        }
        System.out.println("");

        String maior = "";
        Integer maiorNum = Collections.max(estados.values());
        String menor = "";
        Integer menorNum = Collections.min(estados.values());

        for (Map.Entry<String, Integer> entry : estadosPorNome.entrySet()) {
            if(entry.getValue().equals(maiorNum)){
                maior = entry.getKey();
                System.out.println("O estado com maior população é " + maior + " com " + maiorNum + " Pessoas");
            }
            if(entry.getValue().equals(menorNum)){
                menor = entry.getKey();
                System.out.println("O estado com menor população é " + menor + " com " + menorNum + " Pessoas");
            }
        }
        System.out.println("");

        Iterator<Integer> iterator = estados.values().iterator();
        Integer soma = 0;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        Integer media = soma / estados.size();
        System.out.println("A soma das populações é " + soma);
        System.out.println("A média da população é " + media);
        System.out.println("");

        System.out.println("Removido estados com menos de 4.000.000 de habitantes");
        Iterator<Integer> iterator2 = estados.values().iterator();
        while (iterator2.hasNext()){
            if(iterator2.next() < 4000000){
                iterator2.remove();
            }
        }
        System.out.println(estados);
        System.out.println("");

        System.out.println("Checa se a lista foi limpa");
        estados.clear();
        System.out.println(estados.isEmpty());


    }
}

