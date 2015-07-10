package br.com.casadocodigo.estoque;

import java.io.Serializable;

public class ItemEstoque implements Serializable {

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
