import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ExerciciosStream {
    public static void main(String[] args) {
        List<String> numerosAleatoriosInteger = Arrays.asList("1","3","5","7","9","2","4","6","8","10");

        System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante:");
        numerosAleatoriosInteger.stream()
                .skip(3)
                .forEach(System.out::println);

        long countNumerosUnicos = numerosAleatoriosInteger.stream()
                .distinct()
                .count();
        System.out.println("Retirando os números repetidos da lista, quantos números ficam? " + countNumerosUnicos);

        System.out.print("Mostre o menor valor da lista: ");
        numerosAleatoriosInteger.stream().mapToInt(Integer::parseInt).min().ifPresent(System.out::println);

        System.out.print("Mostre o maior valor da lista: ");
        numerosAleatoriosInteger.stream().mapToInt(Integer::parseInt).max().ifPresent(System.out::println);;

        int somaDosNumerosPares = numerosAleatoriosInteger.stream()
                .mapToInt(Integer::parseInt).filter(i -> (i % 2 !=0)).sum();

        System.out.println("Pegue apenas os números ímpares e some: " + somaDosNumerosPares);

        System.out.println("Mostre a lista na ordem numérica: ");
        IntStream organizado = numerosAleatoriosInteger.stream().mapToInt(Integer::parseInt).sorted();
        organizado.forEach(System.out::println);

        System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5:");

        numerosAleatoriosInteger.stream().mapToInt(Integer::parseInt).filter(i -> (((i % 3 == 0) || (i % 5 == 0)) && i%2 != 0))
                .forEach(System.out::println);

    }
}
