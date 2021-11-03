package Lista7;
public class Funcionario {
    private int numeroCracha ;
    private String Nome;
    private String Setor;
    private String Funcao;

    public int getNumeroCracha() {
        return numeroCracha;
    }

    public void setNumeroCracha(int numeroCracha) {
        this.numeroCracha = numeroCracha;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSetor() {
        return Setor;
    }

    public void setSetor(String Setor) {
        this.Setor = Setor;
    }

    public String getFuncao() {
        return Funcao;
    }

    public void setFuncao(String Funcao) {
        this.Funcao = Funcao;
    }
    public Funcionario (){}
    public Funcionario (int numcracha,String nome,String setor,String funcao){
        this.numeroCracha = numcracha;
        this.Nome = nome;
        this.Setor = setor;
        this.Funcao = funcao;
    }
}
