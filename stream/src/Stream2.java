import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream2 {
    public static void main(String[] args) {
        List<String> lista = Arrays.asList("1","45","3","12","24","35");

        lista.forEach(System.out::println);

        /* Limit define o maximo de valores que serão passados
        * Collect pega os dados e joga em outra lista
        * For each roda uma função para cada elemento*/
        lista.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);
        System.out.println();


        lista.stream().map(Integer::parseInt).toList().forEach(System.out::println);
        System.out.println();


        List<Integer> listaPares = lista.stream().map(Integer::parseInt).filter(i -> i % 2 == 0 && i > 2).toList();
        listaPares.forEach(System.out::println);
        System.out.println();

        OptionalDouble media = lista.stream().mapToInt(Integer::parseInt).average();
        media.stream().forEach(System.out::println);
        System.out.println();

        List<Integer> inteiros = lista.stream().map(Integer::parseInt).toList();
        inteiros.removeIf(i -> (i % 2 != 0));
        inteiros.forEach(System.out::println);
    }
}
