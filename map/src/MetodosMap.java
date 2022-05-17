import java.util.*;

public class MetodosMap {
    public static void main(String[] args) {
        Map<String, Double> carrosPopulares = new HashMap<>(){{
           put("gol",14.4);
           put("uno",15.6);
           put("mobi",16.1);
           put("hb20",14.5);
           put("kwid",15.6);
        }};
        System.out.println(carrosPopulares.toString());

        /* Altera o valor de gol */
        carrosPopulares.put("gol",15.2);
        System.out.println(carrosPopulares.toString());

        /* Checa se a chave está no map */
        carrosPopulares.containsKey("tucson");

        /* Pesquisa o valor de uno */
        System.out.println(carrosPopulares.get("uno"));

        /* Retorna as chaves no formato de set */
        Set<String>modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        /* Retorna os valores como uma collection */
        Collection<Double>consumos = carrosPopulares.values();
        System.out.println(consumos);

        /* Retorna o maior e o menor valor do map */
        Double max = Collections.max(carrosPopulares.values());
        Double min = Collections.min(carrosPopulares.values());
        System.out.println(max + " - " + min);

        /* Retorna o nome do maior e do menor carro */
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String maiorCarro = "";
        String menorCarro = "";

        for (Map.Entry<String, Double> entry : entries){
            if (entry.getValue().equals(max)){
                maiorCarro = entry.getKey();
                System.out.println(maiorCarro + " - " + max);

            if(entry.getValue().equals(min)){
                menorCarro = entry.getKey();
                System.out.println(menorCarro + " = " + min);
            }
            }
        }

        /* Exibe a soma dos valores */
        Double soma = 0d;
        Iterator<Double> iterator2 = carrosPopulares.values().iterator();
        while (iterator2.hasNext()){
            soma += iterator2.next();
        }
        System.out.println(soma);

         /* Exibe a média dos valores */
            Double media = soma / carrosPopulares.size();
        System.out.println(media);

        /* Remove objetos com valor de 15,6*/
        Iterator<Double> iterator3 = carrosPopulares.values().iterator();
        while(iterator3.hasNext()){
            if(iterator3.next().equals(15.6)){
                iterator3.remove();
            }
        }
        System.out.println(carrosPopulares);

        /* Ordena pelas chaves */
        TreeMap<String, Double>ordenado = new TreeMap<>(carrosPopulares);
        System.out.println(ordenado);

        /* Apaga a lista de carros e checa se está realmente vazio */
        carrosPopulares.clear();
        System.out.println(carrosPopulares.isEmpty());
    }
}
