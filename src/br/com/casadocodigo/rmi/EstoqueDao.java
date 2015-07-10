package br.com.casadocodigo.rmi;

import java.util.HashMap;
import java.util.Map;

import br.com.casadocodigo.estoque.ItemEstoque;

public class EstoqueDao implements Estoque {

	private Map<String, ItemEstoque> itens = new HashMap<String, ItemEstoque>();
	
	public EstoqueDao() {
		itens.put("ARQ", new ItemEstoque("ARQ", 3, 1));
		itens.put("SOA", new ItemEstoque("SOA", 5, 2));
		itens.put("TDD", new ItemEstoque("TDD", 8, 3));
		itens.put("RES", new ItemEstoque("RES", 1, 4));
		itens.put("LOG", new ItemEstoque("LOG", 3, 5));
		itens.put("WEB", new ItemEstoque("WEB", 2, 6));
	}
	
	@Override
	public ItemEstoque getItemEstoque(String codigo) {
		return itens.get(codigo);
	}

}
