package abstract_factory.java.Factory;

import abstract_factory.java.Modelo.*;

public class FabricaArtDecoFactory implements FabricaFactory {
	public Cadeira fabricaCadeira() {

		System.out.println("Fabricado uma cadeira Art Deco");
		return new CadeiraArtDeco();
	}

	public MesaDeCentro fabricaMesaDeCentro() {

		System.out.println("Fabricando uma mesa Art Deco");
		return new MesaDeCentroArtDeco();

	}

	public Sofa fabricaSofa() {
		System.out.println("Fabricando sofá Art Deco");
		return new SofaArtDeco();
	}

}
