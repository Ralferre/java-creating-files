package Objetos;

public class Produto {
    String nome;
    Double preco;
    int quantidade;
    int quantidadeEmEstoque;

    Integer atualizarEstoque() {
        return quantidadeEmEstoque -= quantidade;
    }
}
