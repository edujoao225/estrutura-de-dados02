package trab01_EDD;

import java.util.Comparator;

public class OrdenarCrescenteBanana implements Comparator<Banana> {

    /**
     Retorna Zero = a e b são iguais
     Retorna Negativo = a é menor
     Retorna Positivo = a é maior
     
     */
	@Override
    public int compare(Banana a, Banana b){
        int resultado = 0;
        if(a == null && b == null){
            return 0;
        }
        if(a == null){
            return -1;
        }
        if(b == null){
            return 1;
        }
        String tipoDaBananaA = a.getTipo();
        if(tipoDaBananaA == null && b.getTipo() != null){
            return -1;
        }
        if(tipoDaBananaA == null){
            resultado = 0;
        }else {
            resultado = a.getTipo().compareTo(b.getTipo());
        }
        if(resultado != 0){
            return resultado;
}