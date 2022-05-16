import java.util.*;

public class Exercicio2 {
    public static void main(String[] args) {

        Set<Linguagem> linguagens = new LinkedHashSet<>(){{
            add(new Linguagem("Java",1991,"Intellij"));
            add(new Linguagem("Python",1989,"Pycharm"));
            add(new Linguagem("Javascript",1995,"VSCode"));
        }};
        System.out.println("--Ordem de inserção--");
        for(Linguagem linguagem : linguagens){
            System.out.println(linguagem.getNome() + " - " + linguagem.getAnoCriacao() + " - " + linguagem.getIde());
        }
        System.out.println("");
        System.out.println("--Ordenado (nome/data/ide)--");
        Set<Linguagem> ordenado = new TreeSet<>(linguagens);
        for (Linguagem linguagem : ordenado){
            System.out.println(linguagem.getNome() + " - " + linguagem.getAnoCriacao() + " - " + linguagem.getIde());
        }
    }
}

class Linguagem implements Comparable<Linguagem>{
    private String nome;
    private Integer anoCriacao;
    private String ide;

    public Linguagem(String nome, Integer anoCriacao, String ide) {
        this.nome = nome;
        this.anoCriacao = anoCriacao;
        this.ide = ide;
    }
    public String getNome() {
        return nome;
    }

    public Integer getAnoCriacao() {
        return anoCriacao;
    }

    public String getIde() {
        return ide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Linguagem linguagem = (Linguagem) o;
        return nome.equals(linguagem.nome) && anoCriacao.equals(linguagem.anoCriacao) && ide.equals(linguagem.ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, anoCriacao, ide);
    }

    @Override
    public int compareTo(Linguagem linguagem) {
        int nome = this.getNome().compareToIgnoreCase(linguagem.getNome());
        int anoCriacao = this.getAnoCriacao().compareTo(linguagem.getAnoCriacao());
        if (nome != 0) return nome;
        if (anoCriacao != 0) return anoCriacao;
        return this.getIde().compareTo(linguagem.getIde());
    }
}
