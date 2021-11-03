
package Lista7;

public class FuncionarioHorista extends Funcionario {
    private int qtdeHoras;
    private double valorHora;

    public int getQtdeHoras() {
        return qtdeHoras;
    }

    public void setQtdeHoras(int qtdeHoras) {
        this.qtdeHoras = qtdeHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    public FuncionarioHorista(){}
    public FuncionarioHorista(int numcracha,String nome,String setor,String funcao,int qtdehoras,double valorhora){
        super.setNome(nome);
        super.setNumeroCracha(numcracha);
        super.setFuncao(funcao);
        super.setSetor(setor);
        this.qtdeHoras = qtdehoras;
        this.valorHora = valorhora;
    }
    public String imprimir(){
        return (String)"Nome: "+super.getNome()+" - "+"Número do Cracha: "+super.getNumeroCracha()+" - "
        +"Função: "+super.getFuncao()+" - "+"Setor: "+super.getSetor()+" - "+"Quantidade de Horas: "+this.qtdeHoras+" - "+
        "Valor da Hora: "+this.valorHora;
    }
    
}
