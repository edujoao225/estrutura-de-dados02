package trab01_EDD;

public class OrdenarDecrescenteBanana extends OrdenarCrescenteMaca{

    /**
     Retorna Zero = a e b são iguais
     Retorna Negativo = a é menor
     Retorna Positivo = a é maior
     */
    public int compare(Banana a, Banana b){
        return super.compare(a,b) * -1;
    }

}

