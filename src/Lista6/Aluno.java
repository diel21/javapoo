package Lista6;

public class Aluno {
    private String Ra;
    private String Nome;
    public Aluno(){}

    public Aluno(String Ra, String Nome) {
        this.Ra = Ra;
        this.Nome = Nome;
    }

    public String getRa() {
        return Ra;
    }

    public void setRa(String Ra) {
        this.Ra = Ra;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    public String imprimir(){return (String)"Nome: "+Nome+"\nRA: "+Ra;}

}
