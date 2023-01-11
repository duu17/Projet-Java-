package Caixa;
import Pagamento.Autorizaçao;
import impressao.Imprimivel;

public class Compra implements Imprimivel, Autorizaçao {
    // Além dos dados de compra do produto, devemos implementar
    // os métodos das duas INTERFACES

    private double valorCompra;
    private String produto;
    private String nomeCliente;

    @Override
    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public String getProduto(String pc_gamer) {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }


    @Override
    public String getCabecalhoNF() {
        // mostrar o nome do cliente
        return this.getNomeCliente();
    }

    @Override
    public String getCorpoNF() {
        // mostrar o produto e o valor da compra
        return this.produto + " = " + this.valorCompra;
    }
}
