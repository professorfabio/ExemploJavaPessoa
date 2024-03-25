import Pessoa;

public class ExemploClassePessoa {
    public static void main(String[] args) {
        // Criando um objeto da classe Pessoa
        Pessoa pessoa1 = new Pessoa("Alice", 25);

        // Acessando o atributo público "idade"
        System.out.println("Idade: " + pessoa1.idade);

        // Usando o método público para acessar o atributo privado "nome"
        System.out.println("Nome: " + pessoa1.getNome());

        // Usando o método público para modificar o atributo privado "nome"
        pessoa1.setNome("Bob");

        // Chamando o método da classe
        pessoa1.saudacao();
    }
}
