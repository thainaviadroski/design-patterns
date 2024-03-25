package abstract_factory.java.Factory;

import abstract_factory.java.Modelo.*;


public class FabricaModernaFactory implements FabricaFactory {


	public Cadeira fabricaCadeira() {

		System.out.println("Fabricado uma cadeira moderna");
		return new CadeiraModerna();
	}

	public MesaDeCentro fabricaMesaDeCentro() {

		System.out.println("Fabricando uma mesa moderna");
		return new MesaDeCentroModerna();

	}

	public Sofa fabricaSofa() {
		System.out.println("Fabricando sofá moderno!!");
		return new SofaModerno();
	}

}
