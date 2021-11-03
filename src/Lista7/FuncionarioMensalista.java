package Lista7;
public class FuncionarioMensalista extends Funcionario{
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public FuncionarioMensalista(){}
    public FuncionarioMensalista(int numchracha,String nome,String setor,String funcao,double salario){
        super.setNumeroCracha(numchracha);
        super.setFuncao(funcao);
        super.setNome(nome);
        super.setSetor(setor);
        this.salario = salario;
    }
    public String imprimir(){
        return (String)"Nome: "+super.getNome()+" - "+"Número do cracha: "+super.getNumeroCracha()+" - "+"Função: "+super.getFuncao()+" - "
                +"Setor: "+super.getSetor()+" - "+"Salario : R$"+this.salario;
    }
}
