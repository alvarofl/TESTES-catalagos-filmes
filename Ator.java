public class Ator extends Pessoa {

    public Ator(String nome, int idade, String nacionalidade, String filmeParticipacao) {
        super(nome, idade, nacionalidade, filmeParticipacao);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Ator: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Nacionalidade: " + getNacionalidade());
        System.out.println("Participou do filme: " + getFilmeParticipacao());
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

    public String getFilmeParticipacao() {
        return super.getFilmeParticipacao(); // Assumindo que está em Pessoa
    }
}
 