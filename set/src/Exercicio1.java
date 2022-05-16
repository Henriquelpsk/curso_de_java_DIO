import java.util.*;

public class Exercicio1 {
    public static void main(String[] args) {
        Set<String> arcoIris = new LinkedHashSet<>(){{
            add("Vermelho");
            add("Laranja");
            add("Amarelo");
            add("Verde");
            add("Azul");
            add("Anil");
            add("Violeta");
        }};
        System.out.println("-----Ordem de inserção-----");
        for (String cor : arcoIris){
            System.out.println(cor);
        }
        System.out.println();

        System.out.println("-----Tamanho-----");
        System.out.println(arcoIris.size());
        System.out.println();

        System.out.println("-----Ordem alfabética-----");
        TreeSet<String> ordemAlfa = new TreeSet<>(arcoIris);
        for (String cor : ordemAlfa){
            System.out.println(cor);
        }
        System.out.println();

        System.out.println("-----Inverso-----");
        NavigableSet<String> inverso = ordemAlfa.descendingSet();
        for (String cor : inverso){
            System.out.println(cor);
        }
        System.out.println("");

        System.out.println("-----Removido os que nao começam com V -----");
        Iterator<String> iterator = arcoIris.iterator();
        while(iterator.hasNext()){
            if(!iterator.next().contains("V")){
                iterator.remove();
            }
        }
        for (String cor : arcoIris){
            System.out.println(cor);
        }
        System.out.println("");

        arcoIris.clear();
        System.out.println(arcoIris.isEmpty());
    }
}
