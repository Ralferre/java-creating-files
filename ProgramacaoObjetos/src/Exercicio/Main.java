package Exercicio;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.codigo = "450332";
        pedido.subtotal = 500;
        pedido.desconto = 15;
        

        System.out.println("Código do produto: " + pedido.getCodigo());
        System.out.println("Subtotal: " + pedido.getSubtotal());
        System.out.println("Desconto: " + pedido.getDesconto());
        System.out.println("Total: " + pedido.getTotal());
    }
}
