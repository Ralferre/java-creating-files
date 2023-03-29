package Objetos;

import java.util.Scanner;

public class Compra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade a ser adquirida do produto: ");
        int quantidadeCompra = scanner.nextInt();

        Produto produto = new Produto();
        produto.nome = "Smartphone";
        produto.preco = 679.90;
        produto.quantidade = quantidadeCompra;
        produto.quantidadeEmEstoque = 18;

        comprarProduto(produto);
        comprarProduto(produto);        
        comprarProduto(produto);
        comprarProduto(produto);
        comprarProduto(produto);

        String s1 = "abc";
        String s2 = "def";
        String s3 = "abcdef";
        System.out.println(s3 == s1 + s2);
        System.out.println("Terminou aqui!");

        scanner.close();
    }

    static void comprarProduto(Produto produto) {
        if (produto.quantidadeEmEstoque < 15) {
            Boolean testeEstoque = true;
            System.out.println("Ponto de reabastecimento atingido!");
            System.out.println(testeEstoque);
        } else {
            Boolean testeEstoque = false;
            System.out.println(testeEstoque);
            System.out.println("Compra realizada com sucesso! Ainda há unidades deste produto em nosso estoque. Obrigado!");
            System.out.println("Quantidade disponível em estoque é: " + produto.atualizarEstoque());
        }

    }
}
