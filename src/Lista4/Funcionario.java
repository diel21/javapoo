package Lista4;

public class Funcionario {
    private int Cracha;
    private String Nome;
    private char TipoVinculo;
    private float ValorHora;
    private float QtdeHora;
    private float Salario;
    private float ValorDesconto;

    public int getCracha() {
        return Cracha;
    }

    public void setCracha(int Cracha) {
        this.Cracha = Cracha;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public char getTipoVinculo() {
        return TipoVinculo;
    }

    public void setTipoVinculo(char TipoVinculo) {
        this.TipoVinculo = TipoVinculo;
    }

    public float getValorHora() {
        return ValorHora;
    }

    public void setValorHora(float ValorHora) {
        this.ValorHora = ValorHora;
    }

    public float getQtdeHora() {
        return QtdeHora;
    }

    public void setQtdeHora(float QtdeHora) {
        this.QtdeHora = QtdeHora;
    }

    public float getSalario() {
        return Salario;
    }

    public void setSalario(float Salario) {
        this.Salario = Salario;
    }

    public float getValorDesconto() {
        return ValorDesconto;
    }

    public void setValorDesconto(float ValorDesconto) {
        this.ValorDesconto = ValorDesconto;
    }
    public float CalcularValorSalario(){
        if (TipoVinculo == 'H'){return (float) ValorHora*QtdeHora-ValorDesconto;}
            
        else {return (float)Salario-ValorDesconto;}
    }
    public String Imprimir(){
        return (String)"Cracha: "+Cracha+"\nNome: "+Nome+"\nTipoVinculo: "+TipoVinculo+"\nSalario Bruto: "+Salario+"\nDesconto: "+ValorDesconto+"\nSalario: "+this.CalcularValorSalario() ;
    }
}
