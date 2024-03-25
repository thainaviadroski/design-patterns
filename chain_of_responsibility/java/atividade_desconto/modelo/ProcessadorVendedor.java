package chain_of_responsibility.java.atividade_desconto.modelo;

public class ProcessadorVendedor extends ProcessadorBase {


	public ProcessadorVendedor(Processador proximoProcessador) {
		super(proximoProcessador);
	}

	public void processar(Venda vlr) {
		if (vlr.getValor() <= 500) {
			double v = (vlr.getValor() - (vlr.getValor() * vlr.getDesconto()));
			System.out.println("Desconto de 10% aplicado!\nR$ " + v);
		} else {
			super.processar(vlr);
		}
	}
}
