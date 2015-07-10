package br.com.casadocodigo.serializacao;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;

import br.com.casadocodigo.estoque.ItemEstoque;

public class TestaSerializacao {

	public static void main(String[] args) {
		ItemEstoque livro1 = new ItemEstoque("ABC", 2, 112);
		ItemEstoque livro2 = new ItemEstoque("CDE", 4, 998);
		ItemEstoque livro3 = new ItemEstoque("EFG", 4, 776);
		
		List<ItemEstoque> itens = Arrays.asList(livro1, livro2, livro3);
		
		try(ObjectOutputStream serializador = new ObjectOutputStream(new FileOutputStream("itens.txt"))) {
			serializador.writeObject(itens);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Arquivo nao foi encontrado");
		} catch (IOException e) {
			throw new RuntimeException("Alguma zica bizarra aconteceu", e);
		}
	}
	
}
