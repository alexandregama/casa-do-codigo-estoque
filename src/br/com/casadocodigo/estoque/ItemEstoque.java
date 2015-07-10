package br.com.casadocodigo.estoque;

import java.io.Serializable;

public class ItemEstoque implements Serializable {

	private static final long serialVersionUID = -6468531905839365906L;

	private final String codigo;

	private final int quantidade;

	public ItemEstoque(String codigo, int quantidade) {
		this.codigo = codigo;
		this.quantidade = quantidade;
	}
	
	@Override
	public String toString() {
		return "ItemEstoque [codigo=" + codigo + ", quantidade=" + quantidade
				+ "]";
	}

	public String getCodigo() {
		return codigo;
	}

	public int getQuantidade() {
		return quantidade;
	}

}
