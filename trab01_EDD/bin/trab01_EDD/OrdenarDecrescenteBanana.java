package trab01_EDD;

public class OrdenarDecrescenteBanana extends OrdenarCrescenteMaca{

    /**
     Retorna Zero = a e b s�o iguais
     Retorna Negativo = a � menor
     Retorna Positivo = a � maior
     */
    public int compare(Banana a, Banana b){
        return super.compare(a,b) * -1;
    }

}

