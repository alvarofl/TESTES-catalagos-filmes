import java.util.ArrayList;

public class Filme {
    private String descricao;
    private String nomeFilme;
    private Diretor diretor;
    private ArrayList<Ator> elenco;

    public Filme(String descricao, String nomeFilme, Diretor diretor, ArrayList<Ator> elenco) {
        this.descricao = descricao;
        this.nomeFilme = nomeFilme;
        this.diretor = diretor;
        this.elenco = elenco;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public ArrayList<Ator> getElenco() {
        return elenco;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" Filme: ").append(nomeFilme).append("\n");
        sb.append(" Descrição: ").append(descricao).append("\n");
        sb.append(" Diretor: ").append(diretor.getNome()).append("\n");
        sb.append(" Elenco:\n");
        for (Ator ator : elenco) {
            sb.append(" - ").append(ator.getNome()).append("\n");
        }
        return sb.toString();
    }
}
 