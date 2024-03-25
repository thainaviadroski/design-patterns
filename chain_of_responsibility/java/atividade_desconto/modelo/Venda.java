package chain_of_responsibility.java.atividade_desconto.modelo;

public class Venda {

	private double valor;
	private double desconto;

	public Venda(double valor, double desconto) {
		this.valor = valor;
		this.desconto = desconto;
	}


	public double getDesconto() {
		return desconto;
	}

	public double getValor() {
		return valor;
	}
}
