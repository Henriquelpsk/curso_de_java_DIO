import java.util.*;

/* Dado seguintes informações sobre minhas séries favoritas,
 * crie um conjunto e ordene esse conjunto exibindo;
 * (nome - gênero - tempo de episódio) */

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {

        Set<Series> listaSeries = new LinkedHashSet<>(){{
            add(new Series("GOT","Fantasia",60));
            add(new Series("Dark","Drama",60));
            add(new Series("that 70's show","Comédia",25));
        }};

        /*for(Series serie : listaSeries){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoDeEpisodio());
        }*/

        Set<Series> listaSeries2 = new TreeSet<>(listaSeries);
        for(Series serie : listaSeries2){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoDeEpisodio());
        }

    }

    public static class Series implements Comparable<Series>{
        String nome;
        String genero;
        Integer tempoDeEpisodio;

        public Series(String nome, String genero, Integer tempoDeEpisodio) {
            this.nome = nome;
            this.genero = genero;
            this.tempoDeEpisodio = tempoDeEpisodio;
        }

        public String getNome() {
            return nome;
        }

        public String getGenero() {
            return genero;
        }

        public Integer getTempoDeEpisodio() {
            return tempoDeEpisodio;
        }

        @Override
        public String toString() {
            return "{" +
                    "nome='" + nome + '\'' +
                    ", genero='" + genero + '\'' +
                    ", tempoDeEpisodio=" + tempoDeEpisodio +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Series series = (Series) o;
            return nome.equals(series.nome) && genero.equals(series.genero) && tempoDeEpisodio.equals(series.tempoDeEpisodio);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nome, genero, tempoDeEpisodio);
        }

        @Override
        public int compareTo(Series serie) {
            int tempoDeEpisodio = Integer.compare(this.getTempoDeEpisodio(), serie.getTempoDeEpisodio());
            if (tempoDeEpisodio != 0) return tempoDeEpisodio;
            return this.getGenero().compareTo(serie.getGenero());
        }
    }
}

