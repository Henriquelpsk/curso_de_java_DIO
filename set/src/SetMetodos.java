import java.util.*;

public class SetMetodos {
    public static void main(String[] args) {

        Set<Double> hashSet = new HashSet<Double>(Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6));

        /* Verifica se o array contém 5.0 */
        hashSet.contains(5d);

        /* Verifica o menor e o maior numero do array */
        Collections.min(hashSet);
        Collections.max(hashSet);

        /* Exibe a soma dos valores do array */
        Iterator<Double> iterator = hashSet.iterator();
        Double soma = 0.0;
        while ((iterator.hasNext())){
            soma += iterator.next();
        }

        /* Calcula a média */
        Double media = soma / hashSet.size();

        /* Remove o 0 */
        hashSet.remove(0d);

        /* Remove as notas menores que 7 */
        Iterator<Double> iterator1 = hashSet.iterator();
        while(iterator1.hasNext()){
            if(iterator1.next() < 7){
                iterator1.remove();
            }
        }

        Set<Double> hashSet2 = new HashSet<Double>(Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6));

        /* Organiza o array */
        Set<Double> hashSetOrganizado = new TreeSet<>(hashSet2);

        /* Apaga todos os dados do array */
        hashSetOrganizado.clear();

        /* Checa se o array está vazio */
        hashSetOrganizado.isEmpty();
    }
}
