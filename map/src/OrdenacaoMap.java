import java.util.*;

/* Dados as seguintes informações sobre meus livros favoritos, crie um dicionário e ordene */
public class OrdenacaoMap {
    public static void main(String[] args) {

        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("Hawnking, Stephen", new Livro("Uma breve história do tempo",256));
            put("Duhigg, Charles", new Livro("O poder do hábito",408));
            put("Harari, Yuval", new Livro("Lições para o século 21",432));
        }};

        Set<Map.Entry<String, Livro>> entries = meusLivros.entrySet();
        for (Map.Entry<String, Livro> entry : entries){
            System.out.println(entry);
        }
        System.out.println("");
        /* Caso precise de ordenar por objeto inserido, mudar o HashMap para LinkedHashMap */
        /* Caso precise de ordenar por ordem alfabética do nome da chave, mudar o HashMap para TreeMap */

        /* Organizado por nome do livro*/
        System.out.println("Lirvos ordenados");
        Set<Map.Entry<String , Livro>> meusLivrosOrdenados = new TreeSet<>(new ComparatorNome());
        meusLivrosOrdenados.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro : meusLivrosOrdenados){
            System.out.println(livro);
        }
    }
}

class Livro{

    private final String nome;
    private final Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return " Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}