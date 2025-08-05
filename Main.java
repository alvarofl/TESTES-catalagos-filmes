import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Filme> filmes = new ArrayList<>();
    private static ArrayList<Ator> atores = new ArrayList<>();
    private static ArrayList<Diretor> diretores = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== MENU CATÁLOGO DE FILMES ===");
            System.out.println("1. Cadastrar Ator");
            System.out.println("2. Cadastrar Diretor");
            System.out.println("3. Cadastrar Filme");
            System.out.println("4. Listar Filmes");
            System.out.println("5. Buscar Informações");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpa o buffer

            switch (opcao) {
                case 1 -> cadastrarAtor(sc);
                case 2 -> cadastrarDiretor(sc);
                case 3 -> cadastrarFilme(sc);
                case 4 -> listarFilmes();
                case 5 -> buscarInformacoes(sc);
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("❌ Opção inválida.");
            }

        } while (opcao != 0);

        sc.close();
    }

    private static void cadastrarAtor(Scanner sc) {
        System.out.print("Nome do Ator: ");
        String nome = sc.nextLine();
        System.out.print("Idade: ");
        int idade = sc.nextInt();
        sc.nextLine();
        System.out.print("Nacionalidade: ");
        String nacionalidade = sc.nextLine();
        System.out.print("Filme que participou: ");
        String filmeParticipacao = sc.nextLine();

        Ator ator = new Ator(nome, idade, nacionalidade, filmeParticipacao);
        atores.add(ator);
        System.out.println("✅ Ator cadastrado!");
    }

    private static void cadastrarDiretor(Scanner sc) {
        System.out.print("Nome do Diretor: ");
        String nome = sc.nextLine();
        System.out.print("Idade: ");
        int idade = sc.nextInt();
        sc.nextLine();
        System.out.print("Nacionalidade: ");
        String nacionalidade = sc.nextLine();
System.out.print("Filme que dirigiu: ");
String filmeParticipacao = sc.nextLine(); 
        Diretor diretor = new Diretor(nome, idade, nacionalidade, filmeParticipacao);
        diretores.add(diretor);
        System.out.println("✅ Diretor cadastrado!");
    }

    private static void cadastrarFilme(Scanner sc) {
        System.out.print("Nome do Filme: ");
        String nomeFilme = sc.nextLine();
        System.out.print("Descrição do Filme: ");
        String descricao = sc.nextLine();

        if (diretores.isEmpty()) {
            System.out.println("⚠️ Nenhum diretor cadastrado.");
            return;
        }

        System.out.println("Selecione um Diretor:");
        for (int i = 0; i < diretores.size(); i++) {
            System.out.println(i + " - " + diretores.get(i).getNome());
        }

        int idx = sc.nextInt();
        sc.nextLine();
        Diretor diretor = diretores.get(idx);

        ArrayList<Ator> elenco = new ArrayList<>();
        for (Ator ator : atores) {
            if (ator.getFilmeParticipacao().equalsIgnoreCase(nomeFilme)) {
                elenco.add(ator);
            }
        }

        Filme filme = new Filme(descricao, nomeFilme, diretor, elenco);
        filmes.add(filme);
        diretor.adicionarFilme(nomeFilme);
        System.out.println("✅ Filme cadastrado!");
    }

    private static void listarFilmes() {
        if (filmes.isEmpty()) {
            System.out.println("⚠️ Nenhum filme cadastrado.");
            return;
        }

        for (Filme f : filmes) {
            System.out.println(f); // usa o toString() da classe Filme
        }
    }

    private static void buscarInformacoes(Scanner sc) {
        System.out.println("\n--- Buscar ---");
        System.out.println("1. Buscar Filme por nome");
        System.out.println("2. Buscar Ator por nome");
        System.out.println("3. Buscar Diretor por nome");
        System.out.print("Escolha uma opção: ");
        int opcao = sc.nextInt();
        sc.nextLine();

        switch (opcao) {
            case 1 -> {
                System.out.print("Digite o nome do filme: ");
                String nome = sc.nextLine();
                boolean encontrado = false;
                for (Filme f : filmes) {
                    if (f.getNomeFilme().trim().equalsIgnoreCase(nome.trim())) {
                        System.out.println(f);
                        encontrado = true;
                    }
                }
                if (!encontrado) System.out.println("❌ Filme não encontrado.");
            }
            case 2 -> {
                System.out.print("Digite o nome do ator: ");
                String nome = sc.nextLine();
                boolean encontrado = false;
                for (Ator a : atores) {
                    if (a.getNome().trim().equalsIgnoreCase(nome.trim())) {
                        System.out.println("Ator: " + a.getNome() + " | Participou de: " + a.getFilmeParticipacao());
                        encontrado = true;
                    }
                }
                if (!encontrado) System.out.println("❌ Ator não encontrado.");
            }
            case 3 -> {
                System.out.print("Digite o nome do diretor: ");
                String nome = sc.nextLine();
                boolean encontrado = false;
                for (Diretor d : diretores) {
                    if (d.getNome().trim().equalsIgnoreCase(nome.trim())) {
                        System.out.println("Diretor: " + d.getNome());
                        System.out.println("Filmes dirigidos: " + d.getFilmesDirigidos());
                        encontrado = true;
                    }
                }
                if (!encontrado) System.out.println("❌ Diretor não encontrado.");
            }
            default -> System.out.println("❌ Opção inválida.");
        }
    }
}
 