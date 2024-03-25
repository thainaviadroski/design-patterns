package chain_of_responsibility.java.atividade_desconto.modelo;

public class ProcessadorSupervisor extends ProcessadorBase {


	public ProcessadorSupervisor(Processador proximoProcessador) {
		super(proximoProcessador);
	}

	public void processar(Venda vlr) {
		if (vlr.getValor() >= 500 && vlr.getValor() <= 2000 ) {
			double v = (vlr.getValor() - (vlr.getValor() * vlr.getDesconto()));
			System.out.println("Desconto de 15% aplicado!\nR$ " + v);
		} else {
			super.processar(vlr);
		}
	}

}
