package chain_of_responsibility.java.atividade_desconto.modelo;

public class ProcessadorGerente extends ProcessadorBase {

	public ProcessadorGerente(Processador proximoProcessador) {
		super(proximoProcessador);
	}

	public void processar(Venda vlr) {
		if (vlr.getValor() > 2000) {
			double v = (vlr.getValor() - (vlr.getValor() * vlr.getDesconto()));
			System.out.println("Desconto de 20% aplicado!\nR$ " + v);
		} else {
			super.processar(vlr);
		}
	}
}
