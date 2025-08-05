
public abstract class Pessoa {
            // Atributos comuns a atores e diretores
            //coloquei como protegido para as sub classes, terem acessos, e o modo protegido fica no nível intermediário do público e privado
            
    protected String nome;
    protected String nacionalidade;
    protected int idade;
        protected String filmeParticipacao;
    // definindo o construtor quando a classe abstrata é criada
    public Pessoa (String nome, int idade, String nacionalidade, String filmeParticipacao) {
        this.nome = nome;
        this.idade = idade;
        this.nacionalidade = nacionalidade;   
                this.filmeParticipacao = filmeParticipacao;
    }
    //criando os métodos que vam ler, e modificar os valores internos get e set 
        public String getNome () {
return nome;
        }
        public int getIdade () {
                return idade;
        }
        public String getNacionalidade () {
                return nacionalidade;
        }
public String getFilmeParticipacao() {
    return filmeParticipacao;
}

        public void setNome (String nome) {
                        this.nome = nome;
        }
        public void setNacionalidade (String nacionalidade) {
         this.nacionalidade = nacionalidade;
        }
        public void setFilmeParticipacao (String filmeParticipacao) {
                this.filmeParticipacao = filmeParticipacao;

        }
        public void setIdade (int idade) {
                this.idade = idade;

        }


//definindo um método abstrato, siguinifica que toda vez que for declarar uma nova classe deverá ser declarado também, a classe abstrata exibirInfo
            public abstract void exibirInfo();

}