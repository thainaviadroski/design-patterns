package adapter.adapters;

import adapter.model.MaquinaCielo;

public class MaquinaCieloAdapter implements Maquina {
	private MaquinaCielo m;

	public MaquinaCieloAdapter(MaquinaCielo m) {
		this.m = m;
	}

	@Override
	public void cobrar() {
		m.processar(0.0);
	}
}
