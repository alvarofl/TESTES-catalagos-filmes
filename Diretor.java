import java.util.ArrayList;

public class Diretor extends Pessoa {
    private ArrayList<String> filmesDirigidos;

    public Diretor(String nome, int idade, String nacionalidade, String filmeParticipacao) {
        // chama o construtor da superclasse Pessoa
        super(nome, idade, nacionalidade, filmeParticipacao);
        this.filmesDirigidos = new ArrayList<>();
    }

    public ArrayList<String> getFilmesDirigidos() {
        return filmesDirigidos;
    }

    public void adicionarFilme(String nomeFilme) {
        if (!filmesDirigidos.contains(nomeFilme)) {
            filmesDirigidos.add(nomeFilme);
        }
    }

    @Override
    public void exibirInfo() {
        System.out.println("Diretor: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Nacionalidade: " + nacionalidade);
        System.out.println("filme que trabalhou: " + filmeParticipacao);
        System.out.println("Filmes dirigidos: " + filmesDirigidos);
    }

    @Override
    public String toString() {
        return "Diretor: " + nome + "\nFilmes dirigidos: " + filmesDirigidos + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Diretor)) return false;
        Diretor outro = (Diretor) obj;
        return nome.equalsIgnoreCase(outro.nome);
    }

    @Override
    public int hashCode() {
        return nome.toLowerCase().hashCode();
    }
}
 