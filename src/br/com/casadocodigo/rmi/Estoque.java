package br.com.casadocodigo.rmi;

import br.com.casadocodigo.estoque.ItemEstoque;

public interface Estoque {

	ItemEstoque getItemEstoque(String codigo);
	
}
