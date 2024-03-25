package adapter.adapters;

import adapter.model.MaquinaStone;

public class MaquinaStoneAdapter implements Maquina {

	private MaquinaStone m;

	public MaquinaStoneAdapter(MaquinaStone m) {
		this.m = m;
	}


	@Override
	public void cobrar() {
		m.registrar(0.0);
	}
}
