package br.com.casadocodigo.estoque;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.casadocodigo.rmi.Estoque;
import br.com.casadocodigo.rmi.HashMapEstoqueDao;

public class EstoqueTest {

	@Test
	public void deveriaRetornarOEstoqueDeUmLivroPeloCodigo() throws Exception {
		Estoque estoque = new HashMapEstoqueDao();
		
		ItemEstoque livro = estoque.getItemEstoque("ARQ");
		
		assertTrue(livro.getQuantidade() > 0);
	}
	
}
