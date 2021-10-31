
package Lista4;

public class Aluno {
    private String Nome;
    private String Ra;
    private float AC1;
    private float AC2;
    private float AG;
    private float AF;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getRa() {
        return Ra;
    }

    public void setRa(String Ra) {
        this.Ra = Ra;
    }

    public float getAC1() {
        return AC1;
    }

    public void setAC1(float AC1) {
        this.AC1 = AC1;
    }

    public float getAC2() {
        return AC2;
    }

    public void setAC2(float AC2) {
        this.AC2 = AC2;
    }

    public float getAG() {
        return AG;
    }

    public void setAG(float AG) {
        this.AG = AG;
    }

    public float getAF() {
        return AF;
    }

    public void setAF(float AF) {
        this.AF = AF;
    }
    public float CalcularMedia(float AC1,float AC2,float AG,float AF){
        return (float) ((this.AC1*0.15)+(this.AC2*0.30)+(this.AG*0.10)+(this.AF*0.45));
    }
    public String verificarAprovacao(float CalcularMedia){
        if (CalcularMedia >= 5){return (String) "Aprovado";}
        else{return (String) "Reprovado";}
    }
    public String Imprimir(){
        return (String)"RA: "+Ra+"\nNome: "+Nome+"\nAC1: "+AC1+"\nAC2: "+AC2+"\nAG: "+AG+"\nAF: "+AF+"\nSituação: "+this.verificarAprovacao(this.CalcularMedia(AC1, AC2, AG, AF))+"\nMedia: "+this.CalcularMedia(AC1, AC2, AG, AF);
    }

}
