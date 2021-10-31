package Lista5;
public class Apolice {
private int Numero;
private String Nome;
private int Idade;
private char Sexo;
private double valorAutomovel;
    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }

    public double getValorAutomovel() {
        return valorAutomovel;
    }

    public void setValorAutomovel(double valorAutomovel) {
        this.valorAutomovel = valorAutomovel;
    }
    public double CalcularValor(){
        if (Sexo =='M' && Idade<=25){return(double) valorAutomovel*10/100;}
        if (Sexo =='M' && Idade>25){return(double)valorAutomovel*5/100;}
        if (Sexo=='F'){return(double)valorAutomovel*2/100;}
        return 0;
    }
    public String Imprimir(){
        return(String)"Numero: "+Numero+"\nNome: "+Nome+"\nIdade: "+Idade+"\nSexo: "+Sexo+"\nValor Automovel: "+valorAutomovel+"\nValor Apolice: "+this.CalcularValor();
    }
    public Apolice(){}
    
    public Apolice(int numero,String nome,int idade, char sexo,double valorautomovel){
             this.setNumero(numero);
             this.setNome(nome);
             this.setSexo(sexo);
             this.setIdade(idade);
             this.setValorAutomovel(valorautomovel);
    }
}
