package factory_method.java.depois_do_padrao.factory;

import factory_method.java.depois_do_padrao.modelo.Aereo;
import factory_method.java.depois_do_padrao.modelo.Transporte;

public class AereoFactory extends TransporteFactory { 

         
    public Transporte criarTransporte() {

         return new Aereo();

    }

}

    

