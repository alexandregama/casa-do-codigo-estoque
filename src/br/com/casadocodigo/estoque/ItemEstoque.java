package br.com.casadocodigo.estoque;

public class ItemEstoque {

	private String codigo;

	private int quantidade;

	public ItemEstoque(String codigo, int quantidade) {
		this.codigo = codigo;
		this.quantidade = quantidade;
	}

	public String getCodigo() {
		return codigo;
	}

	public int getQuantidade() {
		return quantidade;
	}

}
