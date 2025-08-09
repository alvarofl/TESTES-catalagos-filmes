import java.util.*;
//essa importação iu serve para entrada e saída de dados
        import java.io.*;

        import java.nio.file.*;

import java.time.LocalDate;
import java.util.ArrayList;

//criando uma classe abstrata para ser implementada pela sub classes 

public abstract class Pessoa {
            // Atributos comuns a atores e diretores
            //coloquei como protegido para as sub classes, terem acessos, e o modo protegido fica no nível intermediário do público e privado

                protected boolean genero;
                protected String  nome;
    protected LocalDate idade;
    protected Nacionalidade nacionalidade; 
        public enum Nacionalidade {
Argentina, Brasil, Canada, CoreiaDoSul, EstadosUnidos, Inglaterra
        }
        


    // definindo o construtor quando a classe abstrata é criada
    public Pessoa (String nome, boolean genero, LocalDate idade, Nacionalidade nacionalidade) {
        this.genero = genero;
        this.idade = idade;
        this.nacionalidade = nacionalidade;   
                        this.nome = nome;
    }
    //criando os métodos que vam ler, e modificar os valores internos get e set 
                public boolean isMasculino() {

return genero;
        }
        public LocalDate getIdade () {
                return idade;
        }
        public Nacionalidade getNacionalidade () {
                return nacionalidade;
        }
public String getNome() {
    return nome;
}

        public void setGenero (boolean genero) {
                        this.genero = genero;
        }
            public void setNacionalidade(Nacionalidade nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

        public void setIdade (LocalDate idade) {
                this.idade = idade;

        }
public void setNome(String nome) {
    this.nome = nome;
}

//definindo um método abstrato, siguinifica que toda vez que for declarar uma nova classe deverá ser declarado também, a classe abstrata exibirInfo
            public abstract void exibirInfo();

}