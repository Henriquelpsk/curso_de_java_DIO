import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MetodosList {
    public static void main(String[] args) {
        List<Double> novaLista = new ArrayList<Double>();
        novaLista.add(7d);
        novaLista.add(8.5);
        novaLista.add(9.3);
        novaLista.add(5d);
        novaLista.add(7d);
        novaLista.add(0d);
        novaLista.add(3.6);

        /* Procura o índice de 5.0 */
        System.out.println(novaLista.indexOf(5d));

        /* Adiciona 8.0 ao índice 4 */
        novaLista.add(4,8d);

        /* Substitui o 5.0 por 6.0 */
        novaLista.set(novaLista.indexOf(5d),6d);

        /* Checa se existe 5.0 */
        System.out.println(novaLista.contains(5d));

        /* Busca o valor do índice 2 */
        System.out.println(novaLista.get(2));

        /* Procura o menor número */
        System.out.println(Collections.min(novaLista));

        /* Procura o maior número */
        System.out.println(Collections.max(novaLista));

        /* Soma dos valores do array */
        double somaLista = 0;
        for(double numero : novaLista){
            somaLista += numero;
        }
        System.out.println(somaLista);

        /* Calcula a média */
        System.out.println(somaLista / novaLista.size());

        /* Remove ou pelo índice, ou pelo valor indicado*/
        System.out.println(novaLista.remove(0d));

        /* Remove todos os números menores que 7 */
        novaLista.iterator();
        Iterator<Double> iterator = novaLista.iterator();
        while(iterator.hasNext()){
            double next = iterator.next();
            if(next > 7) iterator.remove();
        }
        System.out.println(novaLista);

        /* Limpa a lista */
        novaLista.clear();

        /* Verifica se a lista está vazia */
        System.out.println(novaLista.isEmpty());

    }
}
