package abstract_factory.java.Factory;

import abstract_factory.java.Modelo.*;

public class FabricaVitorianoFactory implements FabricaFactory {

	public Cadeira fabricaCadeira() {

		System.out.println("Fabricado uma cadeira vitoriana");
		return new CadeiraVitoriano();
	}

	public MesaDeCentro fabricaMesaDeCentro() {

		System.out.println("Fabricando uma mesa vitoriana");
		return new MesaDeCentroVitoriano();

	}

	public Sofa fabricaSofa() {
		System.out.println("Fabricando sofá vitoriano");
		return new SofaVitoriano();
	}

}