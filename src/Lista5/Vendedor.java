package Lista5;

public class Vendedor {
    private int Codigo;
    private String Nome;
    private double PercentualComissao;
    private static int quantVendedor = 0;

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public double getPercentualComissao() {
        return PercentualComissao;
    }

    public void setPercentualComissao(double PercentualComissao) {
        this.PercentualComissao = PercentualComissao;
    }
    public Vendedor (){this.quantVendedor = Vendedor.quantVendedor +1;
    }

    public static int getQuantVendedor() {
        return quantVendedor;
    }
    
    public Vendedor (int codigo,String nome,double percentualcomissao){
        this.setCodigo(codigo);
        this.setNome(nome);
        this.setPercentualComissao(percentualcomissao);
    }
    public double calcularPagamentoComissao(double valorVenda){return(double)valorVenda*PercentualComissao/100;}
    public double calcularPagamentoComissao(double valorVenda,double desconto){return (double)this.calcularPagamentoComissao(valorVenda)-desconto;}
    public String imprimir(double valorVenda,double desconto){return (String)"Codigo: "+Codigo+"\nNome: "+Nome+"\nValor da Venda: "+valorVenda
    +"\nPorcentagem de Comissao: "+PercentualComissao+"\nPorcentagem de Desconto: "+desconto+"\nValor a Pagar: "+this.calcularPagamentoComissao(valorVenda, desconto);}
}
