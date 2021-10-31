package Lista6;

import java.util.ArrayList;

public class Pessoa {
    private int Codigo;
    private String Nome;
    private ArrayList<Automovel> Automoveis = new ArrayList<>();

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

    public ArrayList<Automovel> getAutomoveis() {
        return Automoveis;
    }

    public void setAutomoveis(ArrayList<Automovel> Automoveis) {
        this.Automoveis = Automoveis;
    }
    public void setAutomoveis(Automovel auto){
        this.Automoveis.add(auto);
    }
    public Pessoa(){}
    public Pessoa(int codigo,String nome){}
    public void inserirAutomovel(Automovel automovel){Automoveis.add(automovel);}
    public void removerAutomovel(int i){Automoveis.remove(i);}
    public String Imprimir(){return (String)"Nome:"+this.getNome()+"\nCodigo:"+this.getCodigo();}
    public String imprimirCompleto(){return (String)"Nome:"+this.getNome()+"\nCodigo:"+this.getCodigo()+"\nAutomovel:" +this.getAutomoveis();};

}
