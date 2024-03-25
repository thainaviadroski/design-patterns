package chain_of_responsibility.java.atividade_desconto;

import chain_of_responsibility.java.atividade_desconto.modelo.Venda;
import chain_of_responsibility.java.atividade_desconto.modelo.Corrente;

public class Cliente {
	public static void main(String[] args) {
		System.out.println("Chain Of Responsability:\n");

		Corrente c = new Corrente();

		c.processar(new Venda(475.00, 0.10));
		c.processar(new Venda(775.00, 0.15));
		c.processar(new Venda(5475.00, 0.20));

	}

}