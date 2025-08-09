import java.time.LocalDate;


public class Ator extends Pessoa {
    private String filmeParticipacao;

    public Ator(String nome, boolean genero, LocalDate idade, Nacionalidade nacionalidade, String filmeParticipacao) {
    super(nome, genero, idade, nacionalidade);
        this.filmeParticipacao = filmeParticipacao;
    }

    public String getFilmeParticipacao() {
        return filmeParticipacao;
    }

    public void setFilmeParticipacao(String filmeParticipacao) {
        this.filmeParticipacao = filmeParticipacao;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Ator: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Nacionalidade: " + getNacionalidade());
        System.out.println("Participou do filme: " + filmeParticipacao);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Ator)) return false;
        Ator outro = (Ator) obj;
        return getNome().equalsIgnoreCase(outro.getNome()) &&
               getFilmeParticipacao().equalsIgnoreCase(outro.getFilmeParticipacao());
    }

    @Override
    public int hashCode() {
        return (getNome() + getFilmeParticipacao()).toLowerCase().hashCode();
    }

    @Override
    public String toString() {
        return "Ator: " + getNome() + "\nFilme: " + getFilmeParticipacao();
    }
}
 