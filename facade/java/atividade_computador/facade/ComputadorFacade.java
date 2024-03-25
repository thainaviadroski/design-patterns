package facade.java.atividade_computador.facade;

import facade.java.atividade_computador.modelo.Armazenamento;
import facade.java.atividade_computador.modelo.CPU;
import facade.java.atividade_computador.modelo.Memoria;

public class ComputadorFacade {

	//implemente o que esta faltando


	public void incializarComputador() {

		System.out.println("Inicializando computador...");

		CPU cpu = new CPU();
		cpu.iniciarProcessamento();

		Memoria m = new Memoria();
		m.iniciarCarregamento();

		Armazenamento a = new Armazenamento();
		a.iniciarLeituraDeDados();

		System.out.println("Inicialização do computador completada");
	}

}
