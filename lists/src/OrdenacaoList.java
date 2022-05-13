import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoList {
    public static void main(String[] args) {

        List<Gato> gatoList = new ArrayList<Gato>();
        gatoList.add(new Gato("Gatinho",6,"preto"));
        gatoList.add(new Gato("Gatenho",18,"branco"));
        gatoList.add(new Gato("Gatão",10,"caramelo"));

        /* Ordem de inserção */
        System.out.println(gatoList);

        /* Imprime aleatoriamente */
        Collections.shuffle(gatoList);
        System.out.println(gatoList);

        /* Organiza pelo nome */
        Collections.sort(gatoList);
        System.out.println(gatoList);

        /* Ordena por idade */
        gatoList.sort(new comparaIdade());

        /* Ordena pela cor */
        gatoList.sort(new comparatorCor());

    }
}

class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return '{' +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class comparaIdade implements Comparator<Gato>{
    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(),g2.getIdade());
    }
}

class comparatorCor implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}