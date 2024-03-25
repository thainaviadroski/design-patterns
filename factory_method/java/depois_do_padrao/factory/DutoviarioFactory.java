package factory_method.java.depois_do_padrao.factory;

import factory_method.java.depois_do_padrao.modelo.Dutoviario;
import factory_method.java.depois_do_padrao.modelo.Transporte;

public class DutoviarioFactory extends TransporteFactory {
	public Transporte criarTransporte() {

		return new Dutoviario();

	}
}
