import java.util.*;
import java.util.function.Consumer;

public class Stream {
    public static void main(String[] args) {
        Map<Integer, Integer> lista = new HashMap<>(){{
            put(1,21);
            put(2,32);
            put(3,6);
            put(4,8);
            put(5,89);
        }};

        Integer maior = 0;
        Iterator<Integer> iterator = lista.values().iterator();
        while (iterator.hasNext()){
            maior += iterator.next();
        }
        Integer media = maior / lista.size();

        Set<Map.Entry<Integer, Integer>> entries = lista.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries){
            if(entry.getValue() > media){
                System.out.println("Acima da média " + entry.getKey());
            }
        }
        System.out.println("");

        System.out.println("Ordenado por valor");
        Set<Map.Entry<Integer,Integer>> set = new TreeSet<>(Comparator.comparing(Map.Entry::getValue));
        set.addAll(lista.entrySet());
        set.forEach(new Consumer<Map.Entry<Integer, Integer>>() {
            @Override
            public void accept(Map.Entry<Integer, Integer> integerIntegerEntry) {
                System.out.println(integerIntegerEntry);
            }
        });
        }
    }
