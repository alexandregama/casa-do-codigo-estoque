package br.com.casadocodigo.serializacao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import br.com.casadocodigo.estoque.ItemEstoque;

public class TestaDesserializacao {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		try (ObjectInputStream desserializador = new ObjectInputStream(new FileInputStream("itens.txt"))) {
			List<ItemEstoque> itens = (List<ItemEstoque>) desserializador.readObject();
			
			for (ItemEstoque item : itens) {
				System.out.println(item);
			}
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Arquivo nao foi encontrado");
		} catch (IOException e) {
			throw new RuntimeException("Alguma zica bizarra aconteceu", e);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("A classe a ser desserializada nao foi encontrada", e);
		}
	}

}
