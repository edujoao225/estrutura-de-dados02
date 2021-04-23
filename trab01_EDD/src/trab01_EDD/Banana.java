package trab01_EDD;

public class Banana {

    private double peso;
    private String tipo;

    public Banana(){}
    public Banana(String tipo, double peso){
        setTipo(tipo);
        setPeso(peso);
    }

    public double getPeso(){
        return peso;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

}
