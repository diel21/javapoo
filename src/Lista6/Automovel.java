package Lista6;
public class Automovel {
    private String Marca;
    private String Modelo;

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }
    Automovel(){}
    Automovel(String marca,String modelo){
        this.Marca = marca;
        this.Modelo = modelo;
    }
    public String imprimir (){return (String)"Modelo:"+this.getModelo()+"Marca:"+this.getMarca();}
}
