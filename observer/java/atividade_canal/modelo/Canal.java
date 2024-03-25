package observer.java.atividade_canal.modelo;

import java.util.List;

public class Canal extends Subject {

	private String nome;
	private List<Conteudo> conteudoList;

	public Canal(String nome) {
		this.nome = nome;
	}

	public List<Conteudo> getConteudoList() {
		return conteudoList;
	}

	public void setConteudoList(List<Conteudo> conteudoList) {
		this.conteudoList = conteudoList;
	}

	public List<Conteudo> getConteudo() {
		return this.conteudoList;
	}

	public void addContent(Conteudo c) {
		this.conteudoList.add(c);
		notifyObservers();
	}

}
