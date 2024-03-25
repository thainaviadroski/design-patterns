package observer.java.atividade_canal;

import observer.java.atividade_canal.modelo.Canal;
import observer.java.atividade_canal.modelo.Pessoa;

public class Cliente {

	public static void main(String[] args) {
		Canal c = new Canal("Canal Animal");

		c.addObserver(new Pessoa());


	}

}