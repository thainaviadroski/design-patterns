package adapter;

import adapter.adapters.Maquina;
import adapter.adapters.MaquinaCieloAdapter;
import adapter.adapters.MaquinaStoneAdapter;
import adapter.model.MaquinaCielo;
import adapter.model.MaquinaStone;

public class Main {
	public static void main(String[] args) {
		System.out.println("######");

		Maquina maquinaCielo = new MaquinaCieloAdapter(new MaquinaCielo());

		Maquina maquinaStone = new MaquinaStoneAdapter(new MaquinaStone());


		ControleMaquinas cm = new ControleMaquinas();

		cm.executa(maquinaCielo);
		cm.executa(maquinaStone);
	}
}
