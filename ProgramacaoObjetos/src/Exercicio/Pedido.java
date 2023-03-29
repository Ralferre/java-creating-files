package Exercicio;

public class Pedido {
    String codigo;
    double subtotal;
    double desconto;
    
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public double getSubtotal() {
        return subtotal;
    }
    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }
    public double getDesconto() {
        return desconto;
    }
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    public double getTotal() {
        double total;
        return total = subtotal - desconto;
    }
    public void setTotal(double total) {
        
    }

    

}
